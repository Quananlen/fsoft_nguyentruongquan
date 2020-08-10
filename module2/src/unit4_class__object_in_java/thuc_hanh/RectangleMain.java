package unit4_class__object_in_java.thuc_hanh;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Width");
        double width=scanner.nextDouble();
        System.out.println("Enter height");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println(" Your rectangle is  \n" + rectangle.display());
        System.out.println("Perimeter of the rectangle is "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle  is " +rectangle.getArea());
    }
}
