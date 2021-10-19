package ru.mirea.task5.opt3;

public class Test {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();

        Chair chair1 = new Chair("Стул офисный",1500);
        Table table = new Table("Стол школьный",5000);
        Sofa sofa = new Sofa("Диван мягкий",15000);

        furnitureShop.addFurniture(chair1);
        furnitureShop.addFurniture(table);
        furnitureShop.addFurniture(sofa);

        furnitureShop.showRange();

        furnitureShop.add(chair1);
        furnitureShop.add(chair1);
        furnitureShop.add(chair1);

        furnitureShop.add(table);
        furnitureShop.add(table);

        furnitureShop.add(sofa);
        furnitureShop.add(sofa);
        furnitureShop.add(sofa);

        furnitureShop.showRange();

        Chair chair2 = new Chair("Стул офисный",5000);
        furnitureShop.addFurniture(chair2);
        chair2.setName("Стул школьный");
        furnitureShop.addFurniture(chair2);
        furnitureShop.add(chair2);
        furnitureShop.add(chair2);

        furnitureShop.showRange();

        furnitureShop.buy("Диван мягкий");
        furnitureShop.buy("Шкаф угловой");
        furnitureShop.buy("Шкаф угловой");

        furnitureShop.showRange();
    }
}
