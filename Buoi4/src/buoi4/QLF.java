package buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLF {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Friend> listF = new ArrayList<>();

    public static void main(String[] args) {
        QLF ql = new QLF();
        ql.menu();
    }

    public void menu() {
        while (true) {
            int chon;
            System.out.println("\n\n--------Menu--------");
            System.out.println("1, Nhập");
            System.out.println("2, Xuất");
            System.out.println("3, Tìm và sửa");
            System.out.println("4, Sắp xếp tuổi");
            System.out.println("5, Thoát");
            System.out.println("---------------------");
            System.out.println("Mời bạn chọn chức năng ( 1 -> 5) : ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    in();
                    break;
                case 3:
                    tim();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("\nTạm biệt quý khách !!");
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public void nhap() {
        while (true) {
            Friend f = new Friend();
            f.nhapTT();
            listF.add(f);
            System.out.println("Bạn có muốn nhập tiếp không ? (Y/N) : ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("n")) {
                System.out.println("\nNhập thành công !");
                break;
            }
        }
    }

    public void in() {
        System.out.println("\nDanh sách Friend");
        for (Friend f : listF) {
            System.out.println("\n------------");
            f.inTT();
            System.out.println("------------");
        }
    }

    public void tim() {
        System.out.println("\nMời bạn nhập sdt muốn sửa : ");
        String tim = sc.nextLine();
        int check = 0;

        for (Friend f : listF) {
            if (f.getSdt().equalsIgnoreCase(tim)) {
                f.nhapTT();
                check = 1;
            }
        }

        if (check == 0) {
            System.out.println("Không có Friend nào có số điện thoại là " + tim);
        } else {
            System.out.println("\nĐã cập nhập thông tin");
            System.out.println("Danh sách sau khi cập nhập");
            in();
        }
    }

    public void sapXep() {
        Comparator<Friend> ss = new Comparator<Friend>() {
            @Override
            public int compare(Friend o1, Friend o2) {
                return Integer.compare(o1.getTuoi(), o2.getTuoi());
                //-1 x trc y
                // 1 x > y 
                // 0 x=y
            }
        };

        Collections.sort(listF, ss);
        Collections.reverse(listF);
        System.out.println("\nDanh sách sắp xếp theo tuổi :");
        in();
    }
}
