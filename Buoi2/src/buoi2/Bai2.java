package buoi2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n------Menu------");
            System.out.println("1, Thông tin trường học");
            System.out.println("2, Tính trung bình");
            System.out.println("3, Kết thúc");
            System.out.println("----------------");
            System.out.println("Mời bạn chọn 1 tính năng : ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("\n\n");
                    System.out.println("Bạn chọn tính năng 1.");
                    System.out.println("Mời bạn nhập tên trường : ");
                    String ten = sc.nextLine();
                    System.out.println("Mời bạn nhập số lượng GV : ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mời bạn nhập địa chỉ : ");
                    String dc = sc.nextLine();
                    String khoi;
                    if (sl > 200) {
                        khoi = "Đại học";
                    } else if (sl > 150) {
                        khoi = "Cao đẳng";
                    } else if (sl > 100) {
                        khoi = "Trung cấp";
                    } else {
                        khoi = "Cao học";
                    }
                    System.out.println("\n\n");
                    System.out.println("Tên trường : " + ten);
                    System.out.println("Khối giảng dạy : " + khoi);
                    System.out.println("Địa chỉ : " + dc);
                    break;
                case 2:
                    int n;
                    System.out.println("\n\n");
                    System.out.println("Bạn chọn tính năng 2.");
                    while(true){
                       System.out.println("Mời bạn nhập n : "); 
                        n = sc.nextInt();
                       if(n>0){
                           break;
                       }
                    }
                    double tong = 0;
                    int dem = 0;
                    
                    for (int i=0;i<=n;i++){
                        if(i%2==0){
                           tong += i; 
                           dem++;
                        }
                    }
                    
                    if(dem>0){
                      double trungBinh = tong/dem;
                      System.out.println("Trung bình các số chẵn từ 0 tới n là : "+trungBinh);
                    }
                    break;
                case 3:
                    System.out.println("Tạm biệt !! Hẹn gặp lại.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có tính năng ! Mời bạn chọn lại");
            }
        }
    }
}
