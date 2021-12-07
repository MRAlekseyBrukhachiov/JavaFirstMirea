package ru.mirea.task22;

import java.util.Scanner;

public class AbstractFactory {

    private ChairFactory chairFactory;

    public AbstractFactory (ChairFactory chairFactory) {
        this.chairFactory = chairFactory;
    }

    public Chair orderChair(ChairType type) {
        Chair chair = chairFactory.createChair(type);
        System.out.println("Вы купили "+chair.getName()+" за "+chair.getPrice()+" рублей. Спасибо за покупку!");
        return chair;
    }

    public void sitOnChair (Chair chair, Client client) {
        client.Sit(chair);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AbstractFactory chairFactory = new AbstractFactory(new ChairFactory());

        System.out.print("Введите ваше имя: ");
        String name = in.next();

        Client cl1 = new Client(name);
        Chair ch1 = chairFactory.orderChair(ChairType.MagicChair);
        chairFactory.sitOnChair(ch1, cl1);
    }
}
