package Unit1_IntroductionToJava.thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bodyMassIndex;
        System.out.println("Enter Weight");
        weight = scanner.nextDouble();
        System.out.println("Enter Height");
        height = scanner.nextDouble();
        bodyMassIndex = weight / Math.pow(height, 2);
        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight ");
        } else if (bodyMassIndex < 25) {
            System.out.println("Normal");
        } else if (bodyMassIndex < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
