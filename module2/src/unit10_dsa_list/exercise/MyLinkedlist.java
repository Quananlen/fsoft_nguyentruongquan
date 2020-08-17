package unit10_dsa_list.exercise;

public class MyLinkedlist<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //phần tuwrw đàu tiên của danh sách liên kết
    private Node head;
    //số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedlist() {
    }

    public void addFirst(E element) {
        //khai báo biến là temp trỏe đến giá trị của head
        Node temp = head;
        //biến head sẽ nhận giá trị là 1 biến mới
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        //sẽ cho con trỏ chyaj đến phần tử cưới cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        Node holder;
        //cho con trỏ chạy đến vị trí index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        // cho holder them chiếu đến vị trí index
        holder = temp.next;
        //node tại vị trí index-1 sẽ trỏ tới node mới
        temp.next = new Node(element);
        //node mới trỏ đén holder
        temp.next.next = holder;
        numNodes++;
    }

    public Object get(int index) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }
}
