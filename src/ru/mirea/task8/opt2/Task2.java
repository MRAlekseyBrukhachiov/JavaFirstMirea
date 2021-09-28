package ru.mirea.task8.opt2;
import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame{
    Task2(String s){
        super("Task8_opt_2");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        JLabel jl = new JLabel();
        ImageIcon img = new ImageIcon(s);
        jl.setIcon(img);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task2(args[0]);
    }
}
