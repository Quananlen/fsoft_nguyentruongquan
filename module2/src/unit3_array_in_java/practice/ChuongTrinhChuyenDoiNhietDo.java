package unit3_array_in_java.practice;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        byte choose;
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit ");
        System.out.println("nhập lựa chon của bạn");
        choose = scanner.nextByte();
        switch (choose) {
            case 1:
                System.out.println("Enter Fahrenheit ");
                fahrenheit = scanner.nextInt();
                celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println(" Celsius is  " + celsius);
                break;
            case 2:
                System.out.println("Enter Celsius ");
                celsius = scanner.nextInt();
                fahrenheit= (9/5) * celsius + 32;
                System.out.println("Fahrenheit is  " + fahrenheit );
                break;
            case 3:
                System.out.println("see you late ");
                break;
            default:
                System.out.println(" dont choose");
                break;
        }
    }
}