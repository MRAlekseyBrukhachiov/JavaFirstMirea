package ru.mirea.task6.opt2;

public class Ball implements Priceable{
    private int price;
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {}
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
