package Unit5_AccessModifier_StaticMethod_StaticProperty.thuc_hanh;

public class jj {
    void method(int x, int y) {
        x = 5;
        y = 5;
    }

    public static void main(String[] args) {
        jj o = new jj();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}

