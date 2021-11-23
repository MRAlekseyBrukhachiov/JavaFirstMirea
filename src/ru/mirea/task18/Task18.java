package ru.mirea.task18;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        try {
            int age = in.nextInt();
            if (age <= 0)
                throw new ArithmeticException();
            System.out.println("Возраст пользователя: "+age);
        } catch (ArithmeticException e) {
            System.out.println("Введённый возраст некорректен");
        }
    }
}
