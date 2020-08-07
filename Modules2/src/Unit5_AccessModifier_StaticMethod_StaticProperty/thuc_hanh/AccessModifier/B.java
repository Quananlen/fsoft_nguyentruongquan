package Unit5_AccessModifier_StaticMethod_StaticProperty.thuc_hanh.AccessModifier;

public class B {
    public void main(String args[]) {
        A obj=new A();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
