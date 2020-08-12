package unit7_adstract_class_interface.exercise.resizeable;

public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){}
    public Circle(double radius){ this.radius=radius; }
    public Circle(double radius,String color,boolean filled){ super(color, filled);this.radius=radius; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
//    public double getArea(){
//        return Math.PI*Math.pow(radius,2);
//    }
    public double getPrimeri(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Circle has" +
                "radius=" + getRadius()
                + "S=" + getArea();
    }
    @Override
    public void resize(double percent) {
        setRadius(getRadius()*(1+percent));
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
