package ru.mirea.task22;

public class MagicChair implements Chair {
    @Override
    public String getName() {
        return "магический стул";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
