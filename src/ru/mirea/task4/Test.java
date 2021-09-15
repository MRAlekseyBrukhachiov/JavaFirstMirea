package ru.mirea.task4;

public class Test {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        Author a1 = new Author("Paul", "paul.@yandex.ru", 'M');
        Author a2 = new Author("Elena", "elena.@yandex.ru", 'F');
        System.out.println(a1.getName());
        System.out.println(a2.getName());
    }
}
