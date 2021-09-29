package ru.mirea.task8.opt2;
import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame{
    Task2(String s){
        super("Task8_opt_2");
        setSize(600, 600);
        setLocationRelativeTo(null);
        JLabel jl = new JLabel();
        ImageIcon img = new ImageIcon(s);
        jl.setIcon(img);
        add(jl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task2(args[0]);
    }
}
