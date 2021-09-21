package ru.mirea.task7;

public class TestMovable {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        MovableRectangle m1 = new MovableRectangle(6,3,5,2,4,6);
        System.out.println(m1.speedCheck());
        System.out.println(m1.toString());
        m1.moveDown();
        m1.moveRight();
        System.out.println(m1.toString());
    }
}
