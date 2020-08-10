package unit1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SoNgayTrongNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng cần tìm");
        byte a = scanner.nextByte();
        switch (a) {
            case 2:
                System.out.println("tháng có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng có 31 ngày");
                break;
            default:
                System.out.println("tháng có 30 ngày");
        }
    }
}
