package ru.mirea.task5.opt3;

public class Sofa extends Furniture{
    public Sofa(String name,int price) {
        super(name,price);
    }

    @Override
    public String getType() {
        return "Диван";
    }
}
