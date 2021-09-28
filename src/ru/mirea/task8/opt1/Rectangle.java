package ru.mirea.task8.opt1;
import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle(int x0, int y0) {
        super(x0, y0);
    }
    @Override
    public void paintFigure(Graphics gr) {
        int width = 50+(int)(Math.random()*100);
        int length = 50+(int)(Math.random()*100);
        gr.setColor(new Color(r, g, b));
        gr.drawRect(x0, y0,x0+width,y0+length);
    }
}
