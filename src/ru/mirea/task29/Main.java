package ru.mirea.task29;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();

        System.out.println("Введите количество пользователей: ");
        int numOfUsers = in.nextInt();

        System.out.println("|*****РЕГИСТРАЦИЯ*****|");
        for (int i = 1; i <= numOfUsers; i++) {
            System.out.println("Пользователь "+i+". Введите имя и фамилию: ");
            String name = in.next();
            String surname = in.next();
            User user = new User(name, surname, new GregorianCalendar());
            users.add(user);
        }

        SavedUsers savedUsers = new SavedUsers(users);

        FileOutputStream outputStream
                = new FileOutputStream("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(savedUsers);
        objectOutputStream.close();

        System.out.println("|*****СПИСОК ПОЛЬЗОВАТЕЛЕЙ*****|");

        FileInputStream fileInputStream
                = new FileInputStream("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task29\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            SavedUsers savedUsers1 = (SavedUsers) objectInputStream.readObject();
            for (User user: savedUsers1.getUsers()) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
