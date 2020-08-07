package Unit5_AccessModifier_StaticMethod_StaticProperty.thuc_hanh;

public class Static {
    static int count =0;
    Static(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Static number1=new Static();
        Static number2=new Static();
        Static number3=new Static();
    }
}
