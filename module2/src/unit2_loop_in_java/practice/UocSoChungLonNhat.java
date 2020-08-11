package unit2_loop_in_java.practice;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số đầu tiên");
        number1 = scanner.nextInt();
        System.out.println("nhập số thứ 2");
        number2 = scanner.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 == 0 || number2 == 0) {
            System.out.println("không có ước sô chung lớn nhất");
        }
        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
        System.out.println("ước chung lớn nhất là" + number1);
    }
}
