package unit5_accessmodifier_staticmethod_staticproperty.thuc_hanh.AccessModifier;

public class B {
    public void main(String args[]) {
        A obj=new A();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
