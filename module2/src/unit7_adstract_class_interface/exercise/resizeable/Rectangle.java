package unit7_adstract_class_interface.exercise.resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(){}
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle"  +
                "width=" + width +
                ", length=" + length + "s"+getArea();
    }

    @Override
    public void resize(double percent) {
        setLength(getLength()*(1+percent));
        setWidth(getWidth()*(1+percent));
    }
}
