package unit10_dsa_list.practice;

public class MainMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.add(4,9);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
}
