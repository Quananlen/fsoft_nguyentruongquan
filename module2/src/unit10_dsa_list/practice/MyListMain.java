package unit10_dsa_list.practice;

public class MyListMain {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element -1: " + listInteger.get(-1));
        MyList<String> string = new MyList<String>();
        string.add("a");
    }
}
