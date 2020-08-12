package unit7_adstract_class_interface.exercise.resizeable;

public class Square extends Shape  {
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

//    public double getArea() {
//        return this.side * this.side;
//    }
    @Override
    public String toString() {
        return "Square " + "side= " +side+ "s="+ getArea();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * (1 + percent));
    }
    public double getArea() {
        return this.side * this.side;
    }
}
