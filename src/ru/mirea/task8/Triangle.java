package ru.mirea.task8;

import java.awt.*;

public class Triangle extends Shape{
    public Triangle(int x0, int y0) {
        super(x0, y0);
    }

    @Override
    public void paintFigure(Graphics gr) {
        r=(int)(Math.random()*255);
        g=(int)(Math.random()*255);
        b=(int)(Math.random()*255);
        gr.setColor(new Color(r,g,b));
        int width=50+(int)(Math.random()*100);
        int height=50+(int)(Math.random()*100);
        gr.drawLine(x0,y0,x0-width/2,y0+height);
        gr.drawLine(x0-width/2,y0+height,x0+width/2,y0+height);
        gr.drawLine(x0,y0,x0+width/2,y0+height);
    }
}
