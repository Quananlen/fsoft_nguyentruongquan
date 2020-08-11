package unit3_array_in_java.practice;

import java.util.Scanner;

public class ProgramSwapTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        byte choose;
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.println("nhập lựa chon của bạn");
        choose = scanner.nextByte();
        do {
            switch (choose) {
                case 1:
                    System.out.println(" nhập độ F");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println(" nhập độ C");
                    celsius = scanner.nextDouble();
                    System.out.println(celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choose == 0);
    }
}
