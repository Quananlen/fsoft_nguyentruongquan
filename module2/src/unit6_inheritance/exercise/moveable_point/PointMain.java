package unit6_inheritance.exercise.moveable_point;

public class PointMain {
    public static void main(String[] args) {
        Point point=new Point(1,1);
        System.out.println(point.toString());
        MovablePoint movablePoint=new MovablePoint(5,5,5,5);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
