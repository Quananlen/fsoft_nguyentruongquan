package unit5_accessmodifier_staticmethod_staticproperty.practice;

public class TestTestTest {
    int rollno;
    String name;
    static String college ="bachkhoa";
    TestTestTest (int r,String n){
        rollno=r;
        name=n;
    }
    void display (){
        System.out.println(rollno +" "+ name+" "+college);
    }

    public static void main(String[] args) {
        TestTestTest student1 = new TestTestTest(500,"quân");
        TestTestTest student2 = new TestTestTest(500,"minh");
        student1.display();
        student2.display();
    }
}
