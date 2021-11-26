package ru.mirea.task20;

public class User {
    private String name;
    private String surname;
    private int id;
    private static  int cnt = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = ++cnt;
    }

    @Override
    public String toString() {
        return "ID "+id+": " + name + " " + surname;
    }
}
