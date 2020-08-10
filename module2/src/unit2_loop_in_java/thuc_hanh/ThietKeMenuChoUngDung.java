package unit2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        int choice;
        Scanner input =new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.vẽ tam giác");
        System.out.println("2.vẽ hình vuông");
        System.out.println("3.vẽ hình hình chữ nhật");
        System.out.println("0.exit");
        System.out.println("nhập lựa chọn của bạn");
        choice=input.nextInt();
        switch (choice){
            case 1 :
                System.out.println(" vẽ tam giác");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("vẽ hình vuông");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                break;
            case 3:
                System.out.println("vẽ hình chữ nhật");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("không có ở đây ");
        }
    }
}
