package Unit2_LoopInJava.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Vẽ hình chữ nhật");
        System.out.println("2. Vẽ tam giác vuông");
        System.out.println("3. Vẽ tam giác cân");
        System.out.println("0. Exit ");
        System.out.println("Nhập Lưa chon của bạn ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("vẽ hình chữ nhật");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("1. Vẽ tam giác top left ");
                System.out.println("2. Vẽ tam giác top right ");
                System.out.println("3. Vẽ tam giác buttom left ");
                System.out.println("4. Vẽ tam giác buttom right ");
                System.out.println("nhập check");
                int check = scanner.nextInt();
                switch (check) {
                    case 1:
                        System.out.println(" Vẽ tam giác đấy trái");
                        System.out.println("nhập length");
                        int length1 = scanner.nextInt();
                        for (int i = 1; i <= length1; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                            break;
                        }
                    case 2:
                        System.out.println(" Vẽ tam giác đỉnh trái");
                        System.out.println("nhập độ dài");
                        int length2 = scanner.nextInt();
                        for (int i = length2; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                            break;
                        }
                    case 3:
                        for (int i = 1; i < 6; i++) {
                            System.out.println("*".repeat(i));
                        }
                    case 4:
                        System.out.println("vẽ tam giác đấy phải");
                        System.out.println("nhập độ dài");
                        int length4 = scanner.nextInt();
                        break;
                }
            case 3:
                System.out.println("vẽ tam giác cân");
        }
    }
}
