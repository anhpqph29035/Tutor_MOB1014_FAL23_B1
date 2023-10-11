package thithu;

import java.util.Scanner;

public class DoVat {

    private String maDoVat;
    private String tenDoVat;
    private int loai;
    private double gia;

    public DoVat() {
    }

    public DoVat(String maDoVat, String tenDoVat, int loai, double gia) {
        this.maDoVat = maDoVat;
        this.tenDoVat = tenDoVat;
        this.loai = loai;
        this.gia = gia;
    }

    public String getMaDoVat() {
        return maDoVat;
    }

    public void setMaDoVat(String maDoVat) {
        this.maDoVat = maDoVat;
    }

    public String getTenDoVat() {
        return tenDoVat;
    }

    public void setTenDoVat(String tenDoVat) {
        this.tenDoVat = tenDoVat;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma : ");
        maDoVat = sc.nextLine();
        System.out.println("Moi ban nhap ten : ");
        tenDoVat = sc.nextLine();
        while (true) {
            System.out.println("Moi ban nhap loai ( 0.Noi that - 2.Ngoai that) : ");
            loai = Integer.parseInt(sc.nextLine());
            if(loai==0||loai==2){
                break;
            }
        }
        System.out.println("Moi ban nhap gia : ");
        gia = Double.parseDouble(sc.nextLine());
    }
    
    public void xuat(){
        System.out.println("Ma : "+maDoVat);
        System.out.println("Ten : "+tenDoVat);
        if(loai==0){
            System.out.println("Loai : Noi that");
        }else{
            System.out.println("Loai : Ngoai that");
        }
        System.out.println("Gia : "+gia);
    }
}
