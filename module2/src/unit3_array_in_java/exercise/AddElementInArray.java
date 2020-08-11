package unit3_array_in_java.exercise;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] arrayNew = new int[array.length+1];
        int addNumber;
        int index;
        System.out.println(" Enter number you need to insert ");
        addNumber = scanner.nextInt();
        System.out.println(" Enter index to insert in array");
        index = scanner.nextInt();

        if (index < 0 && index > 10) {
            System.out.println("Cann't insert element from array");
        } else {
            for (int i = 0; i < arrayNew.length; i++) {
                if (i == index) {
                    arrayNew[i] = addNumber;

                }
                else if(i>index) {
                    arrayNew[i] = array[i-1];
                }
                else {
                    arrayNew[i] = array[i];
                }
            }
        }
        System.out.print("Mảng sau khi thêm: ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + ",");
        }
        System.out.println("");
    }
}
