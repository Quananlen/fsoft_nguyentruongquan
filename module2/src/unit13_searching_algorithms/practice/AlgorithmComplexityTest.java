package unit13_searching_algorithms.practice;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii] += 1;
        }
        System.out.println("=====");
        System.out.println(frequentChar);
        int max=0;
        char character =255;
        for(int i=0;i<character;i++){
            if (frequentChar[i]>max){
                max=frequentChar[i];
                character= (char) i;
            }
        }
        System.out.println("--------");
        System.out.println(character);
    }
}
