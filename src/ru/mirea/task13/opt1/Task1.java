package ru.mirea.task13.opt1;


import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            mass.add(i);
        }
        System.out.println(mass);
        for (int i = 1; i < mass.size(); i++) {
            if (i % 2 == 0) {
                mass.add(i, 0);
            }
        }
        System.out.println(mass);
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) == 0) {
                mass.remove(i);
            }
        }
        System.out.println(mass);
        System.out.println("Число 10 "+((mass.contains(10)?"найдено":"не найдено")));
        System.out.println("Число 5 "+((mass.contains(5)?"найдено":"не найдено")));
        mass.clear();
        System.out.println(mass);
    }
}
