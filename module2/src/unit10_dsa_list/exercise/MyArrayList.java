package unit10_dsa_list.exercise;

import java.util.Arrays;

public class MyArrayList<E> {
    //số lượng phần tử có trong arraylist khởi tạo là 0
    private int size = 0;
    // sức chứa của arraylist
    private static final int DEFAULTCAPACITY = 10;
    //mảng chứa các phần tử
    public Object[] elements;

    // sưc chứa mặc định khi khởi tạo constructor không có tham số
    public MyArrayList() {
        elements = new Object[DEFAULTCAPACITY];
    }

    //phương thức constructor với sức chứa đc truyền vào
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else
            throw new IllegalArgumentException("capacity" + capacity);
    }

    //phương thức trả về số lượng phần tử trong mảng
    public int size() {
        return this.size;
    }

    //phương thức xóa hết các phan tử trong mảng
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    // phương thức thêm 1 phần tử vào arraylist
    public boolean add(E element) {
        if (elements.length == size) {
            ensureCapacity(2);
        }
        elements[size] = element;
        size++;
        return true;
    }

    // phương thức thêm 1 phần tử theo index;
    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index:" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
        elements[index] = element;
        size++;

    }

    //phương thức tăng kích thước của arraylist
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else
            throw new IllegalArgumentException("minCapacity" + minCapacity);
    }

    //phương thức tìm index c ảu 1 phần tử
    public int indexOf(E elemnet) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(elemnet)) {
                return i;
            }
        }
        return index;
    }

    // phương thức kiểm trea phân tử có trong arraylist ko?
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //clone 1 mảng
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException(" error index " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
             elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element ;
    }
}

