package ru.mirea.task5.opt2;

public class Test {
    public static void main(String[] args) {
        Husky h1 = new Husky("Victor", 2);
        System.out.println(h1);
        Pug p1 = new Pug("Moisha", 4);
        System.out.println(p1);
        System.out.println(h1.getAge());
        System.out.println(p1.getName());
    }
}
