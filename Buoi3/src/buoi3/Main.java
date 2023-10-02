package buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<DoUong> listDU = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
    }

    public void menu() {
        int chon;
        while (true) {
            System.out.println("--------Menu--------");
            System.out.println("1, Nhập ");
            System.out.println("2, Xuất ");
            System.out.println("3, Tìm theo khoảng");
            System.out.println("4, Thoát");
            System.out.println("Mời bạn chọn chức năng : ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timKhoang();
                    break;
                case 4:
                    System.out.println("Chào tạm biệt !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chương trình bạn chọn");
            }
        }
    }

    public void nhap() {
        while (true) {
            DoUong du = new DoUong();
            du.nhapThongTin();
            listDU.add(du);
            System.out.println("Bạn có muốn nhập tiếp không ? (Y/N) : ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuat() {
        for (DoUong d : listDU) {
            d.inThongTin();
        }
    }

    public void timKhoang() {
        double min, max;
        System.out.println("Mời bạn nhập giá min : ");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập giá max : ");
        max = Double.parseDouble(sc.nextLine());

        if (min > max) {
            double temp = min;
            min = max;
            max = temp;
            System.out.println("Do nhập min > max nên đã đổi min cho max");
            System.out.println("Min = "+min);
            System.out.println("Max = "+max);
        }
        
        for (DoUong d : listDU) {
            if (d.getDonGia() >= min && d.getDonGia() <= max) {
                d.inThongTin();
            }
        }

    }
}
