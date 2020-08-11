package unit6_inheritance.exercise.triangle;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter side 1");
        side1=scanner.nextDouble();
        System.out.println("Enter side 2");
        side2=scanner.nextDouble();
        System.out.println("Enter side 3");
        side3=scanner.nextDouble();
        Triangle triangle= new Triangle();
        System.out.println(triangle.toString());
        triangle= new Triangle(side1,side2,side3,"red",true);
        System.out.println(triangle.toString());
    }
}
