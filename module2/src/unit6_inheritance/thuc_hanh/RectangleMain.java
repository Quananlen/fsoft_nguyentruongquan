package unit6_inheritance.thuc_hanh;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(10,10,"red",false);
        System.out.println(rectangle.getArea()+ " "+ rectangle.getPerimeter());
    }
}
