package Unit3_ArrayInJava.bai_tap;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] array ={1,2,3,4,5,6};
        int number;
        int index ;
        System.out.println(" Enter number you need to insert ");
        number = scanner.nextInt();
        System.out.println(" Enter index to insert in array");
        index = scanner.nextInt();
        if(index<=1&&index>10){
            System.out.println("Cann't insert element from array");
        }else {
            
        }
    }
}
