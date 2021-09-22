package ru.mirea.task5.opt1;

public class FryingPan extends Dish {
    private String manufacturer;
    private double diameter;
    public FryingPan(String color, String material, String manufacturer, double diameter) {
        super(color, material);
        this.manufacturer = manufacturer;
        this.diameter = diameter;
    }
    @Override
    public String toString() {
        return "FryingPan{" +
                "manufacturer='" + manufacturer + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
