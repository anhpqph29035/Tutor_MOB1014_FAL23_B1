package btbuoi1;

import java.util.Scanner;

public class BtBuoi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Hoa Quả");
        System.out.println("2. Kiểm Tra Số");
        System.out.println("3. Thoát");
        System.out.println("Mời bạn chọn một chức năng : ");
        int check = sc.nextInt();
        switch (check) {
            case 1:
                //Nhập hoa quả
                System.out.println("CHỨC NĂNG HOA QUẢ");
                System.out.println("Số lượng hoa quả : ");
                int soLuong = sc.nextInt();
                sc.nextLine();
                System.out.println("Tên hoa quả : ");
                String ten = sc.nextLine();
                System.out.println("Giá hoa quả : ");
                double gia = sc.nextDouble();
                System.out.println("Loại hoa quả (1-Nhập khẩu , 2-Nội địa) : ");
                int loai = sc.nextInt();
                //Tính thuế
                double thue;
                if(loai==1){
                    thue =  0.2 * gia;
                }else if(loai == 2){
                    thue = 0.1 *gia ;
                }else {
                    System.out.println("Loại không hợp lệ");
                    return;
                }
                //In ra thông tin 
                double giaBan = gia + thue;
                System.out.println("/n Thông tin hoa quả bạn vừa nhập là : ");
                System.out.println("Số lượng : "+soLuong);
                System.out.println("Tên : "+ten);
                System.out.println("Giá bán : "+giaBan);
                break;
            case 2:
                System.out.println("KIỂM TRA SỐ");
                System.out.println("Mời bạn nhập số thứ 1 : ");
                int s1 = sc.nextInt();
                System.out.println("Mời bạn nhập số thứ 2 : ");
                int s2 = sc.nextInt();
                //Tìm min
                int min = s1;
                if(s2<min){
                    min = s2;
                }
                System.out.println("Số nhỏ nhất là số : "+min);
                // Tìm chia hết cho 5
                if(min%5==0){
                    System.out.println("Số này chia hết cho 5");
                    int kq = min/5;
                    System.out.println("Kết quả "+min+" chia cho 5 là : "+kq);
                }
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
