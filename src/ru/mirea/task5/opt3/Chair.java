package ru.mirea.task5.opt3;

public class Chair extends Furniture{
    public Chair(String name,int price) {
        super(name,price);
    }

    @Override
    public String getType() {
        return "Стул";
    }
}
