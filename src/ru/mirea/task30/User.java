package ru.mirea.task30;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private int age;
    private Calendar date;
    private int id;
    private static int cnt = 0;
    private static ArrayList<User> users = new ArrayList<User>();

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

        if (!hasUser()) {
            date = new GregorianCalendar();
            id = ++cnt;
            users.add(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return cnt;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        User.users = users;
    }

    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : users){
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getCount();
    }

    private boolean hasUser(){
        for (User user : users){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, date, id, users);
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
