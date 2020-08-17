package unit5_accessmodifier_staticmethod_staticproperty.practice.codegym;

public class Student {
    public int rollno;
    public String name;
    public static String college = "BBDIT";

    Student(int index, String name) {
        rollno = index;
        name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

