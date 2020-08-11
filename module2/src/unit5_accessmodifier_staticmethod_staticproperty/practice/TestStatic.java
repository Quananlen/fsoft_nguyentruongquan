package unit5_accessmodifier_staticmethod_staticproperty.practice;

public class TestStatic {
    static int count =0;
    TestStatic(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        TestStatic number1=new TestStatic();
        TestStatic number2=new TestStatic();
        TestStatic number3=new TestStatic();
    }
}
