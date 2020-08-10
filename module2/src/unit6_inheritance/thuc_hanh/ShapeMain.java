package unit6_inheritance.thuc_hanh;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape.toString());
        shape=new Shape("red",false);
        System.out.println(shape.toString());

    }
}
