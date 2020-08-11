package unit6_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(){};
    public Cylinder(double height,double radius,String color){ super(radius,color);this.height=height; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+super.toString()+ getVolume();
    }
}
