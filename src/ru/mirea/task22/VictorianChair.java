package ru.mirea.task22;

public class VictorianChair implements Chair {
    @Override
    public String getName() {
        return "викторианский стул";
    }

    @Override
    public int getPrice() {
        return 700;
    }
}
