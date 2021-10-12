package ru.mirea.task6.opt1;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", 2);
        Dog d2 = new Dog("Chop", 3);
        d1.setName("Bobik");
        d2.setName("Sharik");
        Person p1 = new Person("Joel");
        Person p2 = new Person("Tess");
        p1.setName("Tommy");
        p2.setName("Ellie");
        System.out.println(d1.getName());
        System.out.println(d2.getName());
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
