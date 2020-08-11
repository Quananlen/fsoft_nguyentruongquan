package unit5_accessmodifier_staticmethod_staticproperty.exercise;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1, "res");
        System.out.println("Area of the circle =" + circle.getArea());
        System.out.println(circle.getRadius());
    }
}
