package ru.mirea.task13.opt3;

public class MyArrayList<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2);
        array[pointer++] = item;
    }

    public void add(int index, T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2);
        for (int i = pointer - 1; i >= index; i--)
            array[i + 1] = array[i];
        array[index] = item;
        pointer++;
    }

    public void set(int index, T item) {
        array[index] = item;
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer--] = null;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);
    }

    public void remove(T item) {
        this.remove(this.indexOf(item));
    }

    public int indexOf(T item) {
        for (int i = 0; i < pointer; i++) {
            if (item == array[i])
                return i;
        }
        return -1;
    }

    public int lastIndexOf(T item) {
        if (this.isEmpty())
            return -1;
        return pointer - 1;
    }

    public void clear() {
        for (int i = pointer; i >= 0; i--)
            array[i] = null;
        pointer = 0;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public boolean contains(T item) {
        return this.indexOf(item) != pointer;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        String s = "[";
        if (this.size() == 0) {
            s = "[]";
        } else {
            for (int i = 0; i < pointer; i++) {
                if(i != 0)
                    s+=", ";
                s+= array[i];
            }
            s+="]";
        }
        return s;
    }
}
