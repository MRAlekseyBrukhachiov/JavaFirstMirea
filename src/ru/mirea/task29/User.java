package ru.mirea.task29;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class User implements Serializable {

    private String name;
    private String surname;
    private Calendar date;
    private int id;
    private static  int cnt = 0;

    public User(String name, String surname, Calendar date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        id = ++cnt;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + dateFormat.format(date.getTime()) +
                ", id=" + id +
                '}';
    }
}
