package ru.mirea.task2;

public class Ball {
    private static int count = 0;
    private String color;
    public Ball(String color) {
        this.color = color;
        count++;
    }
    public Ball() {
        color = "black";
        count++;
    }
    public static int getCount() {
        return count;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Ball color: "+this.color;
    }
}
