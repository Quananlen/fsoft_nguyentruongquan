package unit6_inheritance.practice;

public class SquareMain {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        square=new Square(3.5);
        System.out.println(square);
        square=new Square( 10,"red",true);
        System.out.println(square);
    }
}
