package ru.mirea.task22;

public class MultifunctionalChair implements Chair {
    @Override
    public String getName() {
        return "мультифункциональный стул";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
