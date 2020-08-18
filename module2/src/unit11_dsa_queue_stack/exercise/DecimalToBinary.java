package unit11_dsa_queue_stack.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
            int num = scanner.nextInt();
            while (num != 0) {
                stack.push(num % 2);
                num /= 2;
            }
            String str = " ";
            while (!stack.isEmpty()) {
                str += stack.pop();
            }
            System.out.println(str);

    }
}
