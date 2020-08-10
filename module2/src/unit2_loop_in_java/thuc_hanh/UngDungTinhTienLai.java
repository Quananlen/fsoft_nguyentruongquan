package unit2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lương tiền cho vay");
        float tienVay = scanner.nextFloat();
        System.out.println("Nhập tỉ lệ lãi suất theo năm");
        float laiSuat = scanner.nextFloat();
        System.out.println("Nhập sô tháng cho vay");
        int thangVay = scanner.nextInt();
        float soTienLai = tienVay;
        for (int i = 0; i < thangVay; i++) {

            soTienLai += tienVay*laiSuat * thangVay;
        }
        System.out.println(soTienLai);
    }
}
