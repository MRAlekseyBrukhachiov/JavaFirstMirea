package ru.mirea.task2;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog ("Mike", 2);
        Dog d2 = new Dog ("Helen", 7);
        Dog d3 = new Dog ("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        Ball b1 = new Ball();
        Ball b2 = new Ball("red");
        System.out.println(Ball.getCount());
        Book bk1 = new Book("The Master and Margarita", "M. A. Bulgakov");
        System.out.println(bk1);
    }
}
