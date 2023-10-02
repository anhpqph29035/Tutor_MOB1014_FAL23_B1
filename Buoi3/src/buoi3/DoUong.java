package buoi3;

import java.util.Scanner;

public class DoUong {

    private String ma;
    private String ten;
    private double donGia;
    private int loai;

    public DoUong() {
    }

    public DoUong(String ma, String ten, double donGia, int loai) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    //1 - thường 2-full topping
    public String checkLoai(int loai) {
        if (loai == 1) {
            return "Thường";
        } else {
            return "Full Topping";
        }
    }

    public void inThongTin() {
        System.out.println("\n\nThông tin đồ uống");
        System.out.println("Mã : " + ma);
        System.out.println("Tên : " + ten);
        System.out.println("Giá : " + donGia);
        System.out.println("Loại : " + checkLoai(loai));
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã : ");
        ma = sc.nextLine();
        System.out.println("Mời bạn nhập tên : ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập giá : ");
        donGia = Double.parseDouble(sc.nextLine());
        while (true) {
            System.out.println("Mời bạn nhập loại (1-Thường 2-Full Topping : ");
            loai = Integer.parseInt(sc.nextLine());
            if(loai==1 || loai==2){
                break;
            }
        }     
    }
}
