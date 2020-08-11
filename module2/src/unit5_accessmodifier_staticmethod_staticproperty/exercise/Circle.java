package unit5_accessmodifier_staticmethod_staticproperty.exercise;

public class Circle {
     private double radius =1.0;
     private String color ="red";
     Circle(double radius,String color){ this.radius=radius;this.color=color; }
     public String getColor() { return color; }
    protected double getRadius() { return radius; }
    public void setColor(String color) { this.color = color; }
    public void setRadius(double radius) { this.radius = radius; }
    protected double getArea(){
         return Math.PI*Math.pow(radius,2);
    }
}
