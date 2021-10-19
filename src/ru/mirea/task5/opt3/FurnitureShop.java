package ru.mirea.task5.opt3;
import java.util.ArrayList;

public class FurnitureShop {
    public ArrayList<Furniture> range= new ArrayList<>();

    public ArrayList<Furniture> getRange() {
        return range;
    }
    public void addFurniture(Furniture furniture)
    {
        for (Furniture value : range) {
            if (furniture.getName().equals(value.getName())) {
                System.out.println("Такая мебель уже есть");
                return;
            }
        }
        range.add(furniture);
        System.out.println("Мебель успешно добавлена");
    }
    public void add(Furniture furniture)
    {
        for (Furniture value : range)
            if (value.getName().equals(furniture.getName())) {
                value.add();
            }
    }
    public void buy(String name)
    {
        for (Furniture furniture : range)
            if (furniture.getName().equals(name) && furniture.getCount() > 0) {
                furniture.take();
                System.out.println("Вы купили " + name + " за " + furniture.getPrice() + " рублей");
                return;
            }
        System.out.println( "Либо в ассортименте нет такого товара, либо он закончился");
    }
    public void showRange()
    {
        System.out.println("В каталоге: ");
        for (Furniture furniture : range) {
            System.out.println(furniture.getType() + " \"" + furniture.getName() + "\", стоимостью " + furniture.getPrice() + " в количестве " + furniture.getCount());
        }
    }
}
