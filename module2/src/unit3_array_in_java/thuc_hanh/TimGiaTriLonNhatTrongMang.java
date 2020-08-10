package unit3_array_in_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập kich cỡ của mảng");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("vượt quá 20 phần tử rồi");
            }
        } while (size > 20);
        array = new int[size];
        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhâp phần tử thứ  " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("giá trị lớn nhất trong mảng");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                 max=array[i];
            }
        }
        System.out.println(max);
    }
}
