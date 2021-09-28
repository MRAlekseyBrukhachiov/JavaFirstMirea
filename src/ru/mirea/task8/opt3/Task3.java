package ru.mirea.task8.opt3;
import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame{
    Task3(){
        super("Task8_opt_3");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        JLabel jl = new JLabel();
        ImageIcon img = new ImageIcon("D:\\777.gif");
        jl.setIcon(img);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task3();
    }
}
