package ru.mirea.task21;

public class MetroLine {
    private int number;
    private String name;
    private String color;

    public MetroLine(int number, String name, String color) {
        this.number = number;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "MetroLine{" + number +
                "." + name +
                ", color=\"" + color + '\"' +
                '}';
    }
}
