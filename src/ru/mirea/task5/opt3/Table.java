package ru.mirea.task5.opt3;

public class Table extends Furniture{
    public Table(String name, int price) {
        super(name,price);
    }

    @Override
    public String getType() {
        return "Стол";
    }
}
