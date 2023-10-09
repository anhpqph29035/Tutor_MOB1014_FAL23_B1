package b5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QlyDoAn ql = new QlyDoAn();

        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1, Nhap");
            System.out.println("2, Xuat");
            System.out.println("3, Tim theo ten");
            System.out.println("4, Sap xep gia tang dan");
            System.out.println("5, Ke thua");
            System.out.println("0, Thoat");
            System.out.println("Moi ban chon chuc nang (1-5) : ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("Ban chon chuc nang Nhap");
                    while (true) {
                        DoAn da = new DoAn();
                        da.nhap();
                        ql.themDoAn(da);
                        System.out.println("Ban co muon nhap tiep khong (Y/N) : ");
                        String check = sc.nextLine();
                        if(check.equalsIgnoreCase("N")){
                            break;
                        }
                    }
                    break;
                case 2:
                     System.out.println("Ban chon chuc nang Xuat");
                    ArrayList<DoAn> list = ql.getDA();
                    for (DoAn d : list) {
                        d.inThongTin();
                        System.out.println("---------");
                    }
                    break;
                case 3:
                    System.out.println("Ban chon chuc nang Tim");
                    System.out.println("Moi ban nhap ten muon tim : ");
                    String ten = sc.nextLine();
                    DoAn da = ql.timTen(ten);
                    if(da==null){
                        System.out.println("Khong tim thay do an co ten "+ten);
                    }else{
                        System.out.println("Da tim thay do an : ");
                        da.inThongTin();
                    }
                    break;
                case 4:
                    System.out.println("Ban chon chuc nang Sap xep");
                    ArrayList<DoAn> listD = ql.sapXep();
                    System.out.println("List sau khi sap xep :");
                    for (DoAn d : listD) {
                        d.inThongTin();
                    }
                    break;
                case 5:
                    DoAnNhanh dan = new DoAnNhanh(1000,"MKT","Keo",2,5000);
                    dan.inThongTin();
                    break;
                case 0:
                    System.out.println("Tam biet quy khach !");
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
