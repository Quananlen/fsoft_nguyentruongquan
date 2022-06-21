package unit10_dsa_list.practice;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULTCAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULTCAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }
    public void exem(E element){
        if (size == element.long)
            ensurePaca();
    }
        elements [size++]= element;

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Indexx" + i + "size" + i);
        }
        return (E) elements[i];
    }
}
