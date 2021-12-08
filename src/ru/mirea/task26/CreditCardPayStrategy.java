package ru.mirea.task26;

import java.util.Scanner;

public class CreditCardPayStrategy implements PayStrategy {
    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер карты: ");
        in.next();
        System.out.println("Введите CVC код с обратной стороны карты: ");
        in.next();
    }
}
