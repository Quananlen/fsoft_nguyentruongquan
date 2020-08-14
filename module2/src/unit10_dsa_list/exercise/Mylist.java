package unit10_dsa_list.exercise;

public class Mylist<E> {
    private int size = 0;
    static final int DEFAULTCAPACITY = 10;
    private Object[] elements;

    public Mylist() {
        elements = new Object[DEFAULTCAPACITY];
    }
    public void add(int index,E element){
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }
    public E remove (int index){
        
    }
}

