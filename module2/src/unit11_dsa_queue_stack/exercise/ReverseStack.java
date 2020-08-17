package unit11_dsa_queue_stack.exercise;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }
        System.out.println(stack.size());
        System.out.println(stack);
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack2.add((stack.pop()));
        }
        System.out.println(stack.size());
        System.out.println(stack2);

        String str = "This is    a Stack";
        String newStr = "";
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        System.out.println(wStack);
        for (int i = 0; i < str.length(); i++) {
            newStr += wStack.pop();
        }
        System.out.println(newStr);
//        Stack<String> wwStack = new Stack<>();
//        String string = "Đảo    ngược phần tử trong mảng số nguyên";
//        String[] mWord = string.split(" ");
//        System.out.println(Arrays.toString(mWord));
//        for (String word : mWord) {
//            wwStack.push(word);
//        }
////        for(int i=0;i<mWord.length;i++){
////            wwStack.push(mWord[i]);
////        }
//        System.out.println("String was inputted: " + wwStack);
//        Stack<String> reversedWW = new Stack<>();
//        for (String word : mWord) {
//            reversedWW.push(wwStack.pop());
//        }
//        System.out.println("String was reversed: "+ reversedWW);
//    }
    }
}
