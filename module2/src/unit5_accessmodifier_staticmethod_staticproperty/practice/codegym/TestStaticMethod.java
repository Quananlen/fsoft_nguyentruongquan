package unit5_accessmodifier_staticmethod_staticproperty.practice.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1=new Student(18,"Quân");
        Student student2=new Student(19,"Trường");
        Student student3=new Student(10,"Nguyễn");
        student1.display();
        student2.display();
        student3.display();
    }
}
