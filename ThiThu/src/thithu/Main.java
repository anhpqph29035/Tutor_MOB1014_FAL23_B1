package thithu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoVatServices sv = new DoVatServices();
        ArrayList<DoVat> list = new ArrayList<>();
        while (true) {
            int chon;
            System.out.println("\n----Menu----");
            System.out.println("1, Nhap");
            System.out.println("2, Xuat");
            System.out.println("3, Tim ma");
            System.out.println("4, Xoa ten");
            System.out.println("5, Sap xep ma");
            System.out.println("6, Tim khoang");
            System.out.println("7, Sap xep gia giam");
            System.out.println("8, Ke thua");
            System.out.println("0, Thoat");
            System.out.println("Moi ban chon chuc nang (0-8): ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("\nMoi ban nhap thong tin : ");
                    while (true) {
                        DoVat dv = new DoVat();
                        dv.nhap();
                        sv.themDoVat(dv);
                        System.out.println("Ban co muon nhap tiep khong (Y/N) : ");
                        String check = sc.nextLine();
                        if (check.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:                  
                    System.out.println("\nDanh sach do vat :");
                    list = sv.xuatDoVat();
                    for (DoVat d : list) {
                        System.out.println("---------");
                        d.xuat();
                    }
                    break;
                case 3:
                    System.out.println("\nTim theo ma");
                    System.out.println("Moi ban nhap ma : ");
                    String maTim = sc.nextLine();
                    DoVat dv = sv.timDoVat(maTim);
                    if (dv == null) {
                        System.out.println("Khong ton tai do vat co ma : " + maTim);
                    } else {
                        System.out.println("\n\nDo vat ban muon tim : ");
                        dv.xuat();
                    }
                    break;
                case 4:
                    System.out.println("\nXoa theo ten");
                    System.out.println("Moi ban nhap ten muon xoa : ");
                    String tenXoa = sc.nextLine();
                    sv.xoaDoVat(tenXoa);
                    //Nãy mình thiếu phần lấy lại list sau khi xóa các bạn thêm dòng dưới vào nhé 
                    //còn phần phương thức xoaDoVat() bên service để nguyên void như ban đầu không cần 
                    //chỉnh thành ArrayList đâu.
                    list=sv.xuatDoVat();//Thêm dòng này nhé
                    System.out.println("\n\nXoa thanh cong");
                    System.out.println("\nDanh sach do vat sau khi xoa :");
                    for (DoVat d : list) {
                        System.out.println("---------");
                        d.xuat();
                    }
                    break;
                case 5:
                    System.out.println("\n\nSap xep ma");
                    ArrayList<DoVat> lisTSapXep = sv.sapXepMa();
                    System.out.println("\nList sau khi sap xep : ");
                    for (DoVat doVat : lisTSapXep) {
                        System.out.println("---------");
                        doVat.xuat();
                    }
                    break;
                case 6:
                    System.out.println("\nTim theo gia");
                    System.out.println("Moi ban nhap gia bat dau : ");
                    double bd = Double.parseDouble(sc.nextLine());
                    System.out.println("Moi ban nhap gia ket thuc : ");
                    double kt = Double.parseDouble(sc.nextLine());
                    DoVat timGia = sv.timDoVatGia(bd, kt);
                    if (timGia == null) {
                        System.out.println("Khong ton tai do vat nao nhu vay ");
                    } else {
                        System.out.println("\n\nDo vat ban muon tim : ");
                        System.out.println("-------");
                        timGia.xuat();
                    }
                    break;
                case 7:
                    System.out.println("\n\nSap xep gia giam");
                    ArrayList<DoVat> lisTSapXepGia = sv.sapXepGia();
                    System.out.println("\nList sau khi sap xep : ");
                    for (DoVat doVat : lisTSapXepGia) {
                        System.out.println("----------");
                        doVat.xuat();
                    }
                    break;
                case 8:
                    DoHoaPhat dhp = new DoHoaPhat("Go", "MKT", "Ban An", 0, 12000);
                    dhp.xuat();
                    break;
                case 0:
                    System.out.println("Chao tam biet !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co chuong trinh");
            }
        }
    }
}
