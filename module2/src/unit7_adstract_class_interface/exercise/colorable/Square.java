package unit7_adstract_class_interface.exercise.colorable;

public class Square extends Shape{
    private double side = 1;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "The area of square is "+getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
