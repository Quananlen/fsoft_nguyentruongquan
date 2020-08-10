package unit2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("không phải số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("là sô nguyên tố");
            } else {
                System.out.println("không phải số nguyên tố");
            }
        }
    }
}
