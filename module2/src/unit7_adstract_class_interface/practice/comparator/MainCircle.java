package unit7_adstract_class_interface.practice.comparator;
import java.util.Arrays;
import java.util.Comparator;
public class MainCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.0);
        circles[2] = new Circle(2.0, "red", false);
        System.out.println(" pre sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println(" after sorted array");
        for(Circle circle:circles){
            System.out.println(circle);
        }
    }
}

