package unit2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayGeometrys {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw  the rectangle");
        System.out.println("2. Draw  the square triangle");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("0. Exit ");
        System.out.println(" Enter  your choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. Draw  the rectangle");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("1. Draw  the square triangle botton-left ");
                System.out.println("2.Draw  the square triangle top-left ");
                System.out.println("3. Draw  the square triangle top-right ");
                System.out.println("4. Draw  the square triangle   botton-right");
                System.out.println("nhập check");
                int checkTriengle = scanner.nextInt();
                switch (checkTriengle) {
                    case 1:
                        System.out.println("  Enter length of the square triangle");
                        int length1 = scanner.nextInt();
                        for (int i = 1; i <= length1; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 2:
                        System.out.println("  Enter length of the square triangle");
                        int length2 = scanner.nextInt();
                        for (int i = length2; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");

                        }
                        break;
                    case 3:
                        System.out.println("  Enter length of the square triangle");
                        int length3 = scanner.nextInt();
                        for (int i = 1; i < length3; i++) {
                            for (int k = length3 - i; k > 0; k--) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j < i; j++) {
                                System.out.print('*');
                            }
                            System.out.println(" ");;
                        }
                        break;
                    case 4:
                        System.out.println("  Enter length of the square triangle");
                        int length4 = scanner.nextInt();
                        for (int i = length4; i > 0; i--) {
                            for (int k = length4 - i; k > 0; k--) {
                                System.out.print(" ");;
                            }
                            for (int j = 0; j < i; j++) {
                                System.out.print('*');
                            }
                            System.out.println(" ");;
                        }
                        break;
                }
                break;
            case 3:
                for (int i = 0; i < 6; i++) {
                    for (int k = 5 - i; k > 0; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 + 1; j++) {
                        System.out.print('*');
                    }
                    System.out.println(" ");
                }
            case 0:
                System.exit(0);
            default:
                System.out.println(" dont have in menu");
        }
    }
}
