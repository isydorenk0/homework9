package Ex2;

import java.util.Arrays;

public class MyList<T> {
    private T[] myList;
    private int size;

    public int size() {
        return this.size;
    }

    public void add(T element) {
        T[] tmp;
        if (size == 0) {
            tmp = (T[]) new Object[1];
            size = 1;
        } else {
            tmp = Arrays.copyOf(myList, size + 1);
            size++;
        }
        tmp[size - 1] = element;
        myList = tmp.clone();
    }

    public T get(int index) {
        if (index < size && index >= 0)
            return myList[index];
        else throw new IndexOutOfBoundsException("Index out of bounds");
    }

    @Override
    public String toString() {
        return "MyList: " + "data = " + Arrays.toString(myList);
    }
}
