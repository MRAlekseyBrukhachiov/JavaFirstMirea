package ru.mirea.task2;

public class Main {
    public static void main(String[] args) {
        //TestShape
        Shape sh = new Shape("Blue");
        System.out.println(sh);
        //TestDog
        TestDog t1 = new TestDog();
        Dog d1 = new Dog();
        Dog d2 = new Dog("Bob");
        Dog d3 = new Dog("Rex", 5);
        Dog [] array = new Dog[0];
        array = t1.addDog(array, d1);
        array = t1.addDog(array, d2);
        array = t1.addDog(array, d3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
