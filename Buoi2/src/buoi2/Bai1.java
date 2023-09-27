package buoi2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n------Menu------");
            System.out.println("1, Thông tin cá nhân học sinh");
            System.out.println("2, Dãy số");
            System.out.println("3, Kết thúc");
            System.out.println("----------------");
            System.out.println("Mời bạn chọn 1 tính năng : ");
            int chon = sc.nextInt();
            sc.nextLine();
            //regex
            switch (chon) {
                case 1:
                    int lop;
                    System.out.println("\nBạn chọn tính năng 1");
                    System.out.println("Mời bạn nhập họ tên : ");
                    String ten = sc.nextLine();
                    while(true){
                       System.out.println("Mời bạn nhập lớp (1-12): ");
                       lop = sc.nextInt();
                       if(1<lop && lop<=12){
                           break;
                       }
                    }        
                    sc.nextLine();
                    System.out.println("Mời bạn nhập trường học : ");
                    String truong = sc.nextLine();                 
                    String capHoc;
                    if(lop>=10){
                        capHoc = "Cấp Ba";
                    }else if(lop >=6){
                        capHoc = "Cấp Hai";
                    }else{
                        capHoc = "Cấp Một";
                    }
                    System.out.println("----------");
                    System.out.println("Họ tên : "+ten);
                    System.out.println("Cấp học : "+capHoc);
                    System.out.println("Trường :"+truong);
                    break;
                case 2:
                    System.out.println("Bạn chọn tính năng 2");
                    int n;
                    while(true){
                      System.out.println("Mời bạn nhập số n (n>0) : ");  
                      n = sc.nextInt();
                      if(n>0){
                          break;
                      }
                    }
                    System.out.println("Dãy số từ 1 đến n (không bao gồm 5) : ");
                    for (int i = 0;i <= n;i++) {
                        if(i != 5){
                            System.out.println(i+" ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tạm biệt !! Hẹn gặp lại .");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tính năng bạn chọn không tồn tại !");
            }
        }
    }

}
