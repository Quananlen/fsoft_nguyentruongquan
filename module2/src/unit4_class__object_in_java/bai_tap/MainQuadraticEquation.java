package unit4_class__object_in_java.bai_tap;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextInt();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("root 1 =" + equation.getRoot1());
            System.out.println("root 1 =" + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("root =" + equation.getRoot1());
        } else {
            System.out.println("The equation has no real  roots");
        }
    }
}
