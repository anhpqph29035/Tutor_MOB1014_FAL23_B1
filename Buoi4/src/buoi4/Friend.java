package buoi4;

import java.util.Scanner;

public class Friend {
    private String ten;
    private String gioiTinh;
    private int tuoi;
    private String sdt;

    //Khởi tạo constructor
    public Friend() {
    }

    public Friend(String ten, String gioiTinh, int tuoi, String sdt) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }
    
    //Getter & Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên : ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính : ");
        gioiTinh = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi : ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số điện thoại : ");
        sdt = sc.nextLine();
    }
    
    public void inTT(){
        System.out.println("Tên : "+ten);
        System.out.println("Giới tính : "+gioiTinh);
        System.out.println("Tuổi : "+tuoi);
        System.out.println("SDT : "+sdt);
    }
}
