package unit7_adstract_class_interface.practice.Comparable;

import java.util.Arrays;

public class MainCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.0);
        circles[2] = new ComparableCircle(2.0, "red", false);
        System.out.println(" pre sorted");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println(" after sorted array");
        for(ComparableCircle circle: circles)
        System.out.println(circle);
    }
}
