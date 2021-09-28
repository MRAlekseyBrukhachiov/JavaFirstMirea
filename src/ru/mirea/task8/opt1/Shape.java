package ru.mirea.task8.opt1;
import java.awt.Graphics;

public abstract class Shape {
    protected int r, g, b, x0, y0;
    public Shape(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
        r = (int)(Math.random()*255);
        g = (int)(Math.random()*255);
        b = (int)(Math.random()*255);
    }
    public abstract void paintFigure(Graphics gr);
}
