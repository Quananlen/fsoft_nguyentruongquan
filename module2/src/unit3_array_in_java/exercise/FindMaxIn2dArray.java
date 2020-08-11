package unit3_array_in_java.exercise;

import java.util.Scanner;

public class FindMaxIn2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input length of matrix");
        int length = scanner.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("input for row " + (i + 1) + " and column " + (j + 1));
                int value = scanner.nextInt();
                array[i][j] = value;
            }
        }
        System.out.println(findMax(array));
    }
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) max = j;
            }
        }
        return max;
    }
}
