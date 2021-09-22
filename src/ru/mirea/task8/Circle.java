package ru.mirea.task8;

import org.w3c.dom.css.RGBColor;

import java.awt.*;

public class Circle extends Shape{
    public Circle(int x0, int y0) {
        super(x0, y0);
    }

    public void paintFigure(Graphics gr) {
        r=(int)(Math.random()*255);
        g=(int)(Math.random()*255);
        b=(int)(Math.random()*255);
        gr.setColor(new Color(r,g,b));
        int width=50+(int)(Math.random()*100);
        int length=50+(int)(Math.random()*100);
        gr.drawOval(x0,y0,width,length);
    }
}
