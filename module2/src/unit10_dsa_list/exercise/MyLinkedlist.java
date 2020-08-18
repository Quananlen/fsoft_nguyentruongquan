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

    //phần tử đàu tiên của danh sách liên kết
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
        // cho holder tham chiếu đến vị trí index
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
    public boolean contains(E element) {
        //nếu element có trong danh sách thì indexOf sẽ lớn hơn hoặc bằng không
        return indexOf(element) >= 0;
    }
   // Phương thức trả về vị trí của 1 phần tử trong danh sách
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    /**
     * phướng thức xóa các phân tử trong LinkedList
     */
    public void clear() {
        Node temp = head;
        head = null;
        while (temp.next != null) {
            temp.next = null;
        }
        numNodes = 0;
    }
    /**
     *   Hiển thị ra Danh sách
     */
    /**
     * Remove 1 phần tử ở vị trí index
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        //Kiểm tra điều kiện index, thow exception nếu index lớn hơn số lượng node hoặc nhỏ hơn 0
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        //Khai báo 1 node trỏ đến head
        Node temp = head;
        //Khai báo đối tượng object để nhận dữ liệu trả về
        Object data;
        //Nếu index = 0 thì trả về data hiện tại và head mới sẽ là node kế tiếp
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            //Nếu index >0 cho con trỏ chạy đến index - 1
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            //data trỏ đến node index
            data = temp.next.data;
            //node index trỏ tới index + 1
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }
    /**
     * Phương thức remove 1 đối tượng
     *
     * @param element
     * @return
     */
    public boolean remove(E element) {
        if (head.data.equals(element)) {
            //remove nếu đối tượng là head
            remove(0);
            return true;
        } else {
            //Khai báo 1 node trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ trỏ đến node thứ 2 kế tiếp
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    /**
     * phương thức in ra mảng linkedlist;
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
