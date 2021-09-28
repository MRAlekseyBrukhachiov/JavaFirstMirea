package ru.mirea.task8.opt1;
import java.awt.*;

public class Circle extends Shape{
    public Circle(int x0, int y0) {
        super(x0, y0);
    }
    @Override
    public void paintFigure(Graphics gr) {
        int width = 50+(int)(Math.random()*100);
        int length = 50+(int)(Math.random()*100);
        gr.setColor(new Color(r, g, b));
        gr.drawOval(x0, y0, width, length);
    }
}
