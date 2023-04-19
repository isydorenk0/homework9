package Ex3;

import java.util.Arrays;

public class MyDictionary<K, V> {
    private K key;
    private V value;
    private int size;
    private MyDictionary<K, V>[] myDictionary;

    public MyDictionary() {
    }

    public MyDictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void add(K key, V value) {
        MyDictionary[] tmp;
        if (size == 0) {
            tmp = new MyDictionary[1];
            size = 1;
        } else {
            tmp = Arrays.copyOf(myDictionary, size + 1);
            size++;
        }
        tmp[size - 1] = new MyDictionary(key, value);
        myDictionary = tmp.clone();
    }

    public MyDictionary<K, V> get(int index) {
        if (index < size && index >= 0)
            return myDictionary[index];
        else throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (key == null){
            return this.getClass().toString();
        }
        return "key = " + key +
                ", value = " + value;
    }
}
