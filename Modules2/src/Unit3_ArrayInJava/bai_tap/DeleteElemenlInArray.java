package Unit3_ArrayInJava.bai_tap;

import java.util.Scanner;

public class DeleteElemenlInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử cần xóa");
        int value = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    check = true;
                }
                array[array.length -1 ] = 0;
                i--;
            }
        }
        if (!check) {
            System.out.println(" không tìm thấy giá trị trong mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + "\t");
            }
        }
    }
}
