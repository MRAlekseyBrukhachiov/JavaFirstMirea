package ru.mirea.task26;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order;
        System.out.print("Введите номер заказа: ");
        order = sc.next();

        System.out.println("Выберите способ оплаты: \n" +
                "1.Кредитная карта\n" +
                "2.Электронный кошелёк");

        int temp;
        temp = sc.nextInt();

        switch (temp) {
            case 1 -> {
                CreditCard creditCard = new CreditCard();
                creditCard.pay();
            }
            case 2 -> {
                OnlineWallet onlineWallet = new OnlineWallet();
                onlineWallet.pay();
            }
            default -> System.out.print("Ошибка ввода");
        }

        System.out.println("Заказ \""+order+"\" успешно оплачен. Спасибо за покупку!");
    }
}
