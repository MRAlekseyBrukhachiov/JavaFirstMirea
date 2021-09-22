package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
public abstract class Shape {
    protected int r,g,b,x0,y0;

    public Shape(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public abstract void paintFigure(Graphics gr);
}
