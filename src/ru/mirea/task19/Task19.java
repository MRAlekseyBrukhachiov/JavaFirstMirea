package ru.mirea.task19;
import java.util.Scanner;
public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату рождения (день, месяц, год через пробел)");
        try {
            DateOfBirthException date = new DateOfBirthException(in.nextInt(), in.nextInt(), in.nextInt());
            System.out.println(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
