package ru.mirea.task5.opt3;

public abstract class Furniture {
    private int count, price;
    private String name;

    public Furniture(String name,int price) {
        this.price = price;
        this.name = name;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void add()
    {
        count++;
    }
    public void take()
    {
        count--;
    }
    public abstract String getType();
}
