package b5;

import java.util.Scanner;

public class DoAn {
    private String maDoAn;
    private String tenDoAn;
    private double soLuong;
    private double donGia;

    public DoAn() {
    }

    public DoAn(String maDoAn, String tenDoAn, double soLuong, double donGia) {
        this.maDoAn = maDoAn;
        this.tenDoAn = tenDoAn;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaDoAn() {
        return maDoAn;
    }

    public void setMaDoAn(String maDoAn) {
        this.maDoAn = maDoAn;
    }

    public String getTenDoAn() {
        return tenDoAn;
    }

    public void setTenDoAn(String tenDoAn) {
        this.tenDoAn = tenDoAn;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void inThongTin(){
        System.out.println("\n\nMa : "+maDoAn);
        System.out.println("Ten : "+tenDoAn);
        System.out.println("So luong : "+soLuong);
        System.out.println("Don gia : "+donGia);
        System.out.println("Thanh tien : "+thanhTien());
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma : ");
        maDoAn = sc.nextLine();
        System.out.println("Moi ban nhap ten : ");
        tenDoAn = sc.nextLine();
        System.out.println("Moi ban nhap so luong : ");
        soLuong = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap don gia : ");
        donGia = Double.parseDouble(sc.nextLine());
    }
    
    public double thanhTien(){
        return donGia*soLuong;
    }
}
