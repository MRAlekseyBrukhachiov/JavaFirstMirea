package ru.mirea.task8.opt1;
import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    boolean f = false;
    public Task1() {
        super("Task8_opt_1");
        setLayout(null);
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        setBackground(Color.white);
        if(!f) {
            for (int i = 0; i < 20; i++)
            {
                int x = 100+(int)(Math.random()*500);
                int y = 100+(int)(Math.random()*500);
                int a = (int)(Math.random()*3);
                Shape shape = switch (a) {
                    case 0 -> new Rectangle(x, y);
                    case 2 -> new Triangle(x, y);
                    default -> new Circle(x, y);
                };
                shape.paintFigure(g);
            }
            f = true;
        }
    }
    public static void main(String []args) {
        new Task1();
    }
}
