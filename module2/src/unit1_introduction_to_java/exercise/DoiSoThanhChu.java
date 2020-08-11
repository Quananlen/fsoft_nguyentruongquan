package unit1_introduction_to_java.exercise;

import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        String str = "";
        int hundred = (int) Math.floor(number / 100);
        int temp = number % 100;
        int ten = (int) Math.floor(temp / 10);
        int one = number % 10;
        if (0 < number && number < 20) {
            switch (number) {
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "three";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;
                case 10:
                    str = "ten";
                    break;
                case 11:
                    str = "eleven";
                    break;
                case 12:
                    str = "twelve";
                    break;
                case 13:
                    str = "thirteen";
                    break;
                case 14:
                    str = "fourteen";
                    break;
                case 15:
                    str = "fifteen";
                    break;
                case 16:
                    str = "sixteen";
                    break;
                case 17:
                    str = "seventeen";
                    break;
                case 18:
                    str = "eighteen";
                    break;
                case 19:
                    str = "nineteen";
                    break;
            }
        }
        if (20 < number && number < 1000) {
            switch (hundred) {
                case 2:
                    str = "two hundred";
                    break;
                case 3:
                    str = "three hundred";
                    break;
                case 4:
                    str = "four hundred";
                    break;
                case 5:
                    str = "five hundred";
                    break;
                case 6:
                    str = "six hundred";
                    break;
                case 7:
                    str = "seven hundred";
                    break;
                case 8:
                    str = "eight hundred";
                    break;
                case 9:
                    str = "nine hundred";
                    break;
            }
            if (ten != 0 && one != 0) str += " and";
            if (ten != 1) {
                switch (ten) {
                    case 2:
                        str += " twenty";
                        break;
                    case 3:
                        str += " thirty";
                        break;
                    case 4:
                        str += " forty";
                        break;
                    case 5:
                        str += " fifty";
                        break;
                    case 6:
                        str += " sixty";
                        break;
                    case 7:
                        str += " seventy";
                        break;
                    case 8:
                        str += " eighty";
                        break;
                    case 9:
                        str += " ninety";
                        break;
                }
                switch (one) {
                    case 1:
                        str += " one";
                        break;
                    case 2:
                        str += " two";
                        break;
                    case 3:
                        str += " three";
                        break;
                    case 4:
                        str += " four";
                        break;
                    case 5:
                        str += " five";
                        break;
                    case 6:
                        str += " six";
                        break;
                    case 7:
                        str += " seven";
                        break;
                    case 8:
                        str += " eight";
                        break;
                    case 9:
                        str += " nine";
                        break;
                }
            } else switch (one) {
                case 0:
                    str += " ten";
                    break;
                case 1:
                    str += " eleven";
                    break;
                case 2:
                    str += " twelve";
                    break;
                case 3:
                    str += " thirteen";
                    break;
                case 4:
                    str += " fourteen";
                    break;
                case 5:
                    str += " fifteen";
                    break;
                case 6:
                    str += " sixteen";
                    break;
                case 7:
                    str += " seventeen";
                    break;
                case 8:
                    str += " eighteen";
                    break;
                case 9:
                    str += " nineteen";
                    break;
            }
        }
        System.out.println(str);
    }
}
