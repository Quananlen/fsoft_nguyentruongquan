package unit4_class__object_in_java.bai_tap;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(10, true, 10, "yelow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(5, false, 10, "blue");
        System.out.println(fan2.toString());
    }
}
