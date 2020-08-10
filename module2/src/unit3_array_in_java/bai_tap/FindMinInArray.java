package unit3_array_in_java.bai_tap;

import java.util.Scanner;

public class FindMinInArray {
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
        System.out.println(findMinInArray(array));
    }
    public static int findMinInArray(int []myArray){
        int min=myArray[0];
        for (int i=1;i<myArray.length;i++){
            if(min>myArray[i]){
                min = myArray[i];
            }
        }
        return min;
    }
}
