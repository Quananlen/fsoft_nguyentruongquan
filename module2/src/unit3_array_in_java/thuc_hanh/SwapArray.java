package unit3_array_in_java.thuc_hanh;

import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("vượt quá 20 phần tử rồi");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập phần tử thứu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("in ra các phần tử trong mảng");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");

        }
        System.out.println(" ");
        // đảo ngươc các thành phần trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.println(" mảng sau khi đảo ngược");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
