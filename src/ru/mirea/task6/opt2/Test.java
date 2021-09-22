package ru.mirea.task6.opt2;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("World", "S.King");
        Book b2 = new Book("Life", "S.King");
        b1.setPrice(1000);
        b2.setPrice(3000);
        Ball bl1 = new Ball(50, 20);
        Ball bl2 = new Ball(25, 40);
        bl1.setPrice(50);
        bl2.setPrice(150);
        System.out.println(b1.getPrice());
        System.out.println(b2.getPrice());
        System.out.println(bl1.getPrice());
        System.out.println(bl2.getPrice());
    }
}
