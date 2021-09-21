package ru.mirea.task3.opt2;

public class Leg {
    private int size;
    public Leg(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoe size: "+this.size;
    }
}
