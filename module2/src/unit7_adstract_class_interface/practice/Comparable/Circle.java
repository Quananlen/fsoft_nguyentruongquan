package unit7_adstract_class_interface.practice.Comparable;

public class Circle {
    private String color = "red";
    private double radius = 1.0;
    private boolean filled =true;
    public Circle() {
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color,boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled=filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) { this.filled = filled; }
    public boolean isFilled() { return filled; }
    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}'+ (isFilled()? "filled":"not filled");
    }
}
