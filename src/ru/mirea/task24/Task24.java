package ru.mirea.task24;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<User>();
        String login, password;
        Pattern loginPattern = Pattern.compile("\\w*");
        Pattern passwordPattern = Pattern.compile("^[A-Za-z0-9]{6,}$");

        System.out.println("|*****РЕГИСТРАЦИЯ*****|");

        while (true) {
            System.out.print("Логин: ");
            login = in.next();
            System.out.print("Пароль: ");
            password = in.next();
            if (!loginPattern.matcher(login).matches()) {
                System.out.println("Логин может содержать только буквенно-цифровые символы или знак подчёркивания");
            } else if (!passwordPattern.matcher(password).matches()) {
                System.out.println("Длина пароль должна быть не менее 6 символов. Символами могут быть только буквы латинского алфавита и цифры");
            } else {
                User user = new User (login, password);
                users.add(user);
                break;
            }
        }

        System.out.println("Вы успешно зарегистрировались");
    }
}
