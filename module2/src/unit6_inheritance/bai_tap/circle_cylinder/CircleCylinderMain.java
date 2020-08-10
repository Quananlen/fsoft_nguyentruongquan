package unit6_inheritance.bai_tap.circle_cylinder;

public class CircleCylinderMain {
    public static void main(String[] args) {
        Circle circle =new Circle(10,"red");
        System.out.println(circle.toString());
        Cylinder cylinder=new Cylinder(10,10,"greem");
        System.out.println(cylinder.toString());
    }
}
