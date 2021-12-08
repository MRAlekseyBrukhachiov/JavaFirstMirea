package ru.mirea.task26;

import java.util.Scanner;

public class OnlineWalletPayStrategy implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("Введите номер электронного кошелька");
        Scanner in = new Scanner(System.in);
        in.next();

        System.out.println("На ваш номер телефона выслан код. Введите его для оплаты.");
        int kod = 100000 + (int) (Math.random() * 999999);
        System.out.println(kod);

        int kod1 = in.nextInt();

        while (kod1 != kod) {
            System.out.println("Неверный код. Попробуйте ещё раз: ");
            kod1 = in.nextInt();
        }
    }
}
