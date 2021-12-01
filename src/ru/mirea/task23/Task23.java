package ru.mirea.task23;

import java.util.ArrayList;
import java.util.Scanner;

public class Task23 {

    public static User check(ArrayList<User> users, User user)
    {
        for (int i = 0; i < 3; i++) {
            if (user.hashCode() == users.get(i).hashCode())
                return users.get(i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login,password;
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("Шамиль", "superman","12345678"));
        users.add(new User("Никита","_saharok_003","01042003"));
        users.add(new User("Алексей","drug_alesha","099644690"));

        for (int i = 0; i < 3; i++) {
            System.out.println(users.get(i));
        }

        System.out.print("Логин: ");
        login = in.next();
        System.out.print("Пароль: ");
        password = in.next();

        while (check(users, new User(login, password)) == null) {
            System.out.println("Неправильный логин или пароль");
            System.out.print("Логин: ");
            login = in.next();
            System.out.print("Пароль: ");
            password = in.next();
        }

        User user = check(users, new User(login, password));
        System.out.println("Добро пожаловать, "+user.getName());
    }
}
