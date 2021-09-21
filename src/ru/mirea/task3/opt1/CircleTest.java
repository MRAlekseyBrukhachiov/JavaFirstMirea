package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println(c1.getLength());
        System.out.println(c1);
        Circle c2 = new Circle(3, "red");
        c2.setColor("black");
        System.out.println(c2);
    }
}
