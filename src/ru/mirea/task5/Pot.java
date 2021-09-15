package ru.mirea.task5;

public class Pot extends Dish {
    private double volume;
    private String coating;
    public Pot(String color, String material, double volume, String coating) {
        super(color, material);
        this.volume = volume;
        this.coating = coating;
    }
    @Override
    public String toString() {
        return "Pot{" +
                "volume=" + volume +
                ", coating='" + coating + '\'' +
                '}';
    }
}
