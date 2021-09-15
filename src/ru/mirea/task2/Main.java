package ru.mirea.task2;

public class Main {
    public static void main(String[] args) {
        TestDog t1 = new TestDog();
        Dog d1 = new Dog();
        Dog [] array = new Dog[0];
        array = t1.addDog(array, d1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
