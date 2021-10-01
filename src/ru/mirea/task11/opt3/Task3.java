package ru.mirea.task11.opt3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JTextArea textArea = new JTextArea(10, 25);

    private JMenuBar createMenu() {
        JMenu color = new JMenu("Color");
        JMenu mFont = new JMenu("Font");
        Font font1 = new Font("Serif", Font.ITALIC, 18);
        Font font2 = new Font("Courier New", Font.BOLD, 22);
        Font font3 = new Font("Tahoma", Font.BOLD,24);

        JMenuItem colorRed = new JMenuItem("Red");
        JMenuItem colorGreen = new JMenuItem("Green");
        JMenuItem colorBlue = new JMenuItem("Blue");
        color.add(colorRed);
        color.add(colorGreen);
        color.add(colorBlue);

        JMenuItem iFont1 = new JMenuItem("Serif 18 Курсив");
        JMenuItem iFont2 = new JMenuItem("Courier New 22 Полужирный");
        JMenuItem iFont3 = new JMenuItem("Tahoma 24 Полужирный");
        mFont.add(iFont1);
        mFont.add(iFont2);
        mFont.add(iFont3);

        colorRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.red);
            }
        });
        colorBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.blue);
            }
        });
        colorGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.green);
            }
        });
        iFont1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(font1);
            }
        });
        iFont2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(font2);
            }
        });
        iFont3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(font3);
            }
        });

        menuBar.add(color);
        menuBar.add(mFont);
        return menuBar;
    }
    public Task3() {
        super("Text Area");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        add(createMenu(), BorderLayout.NORTH);
        add(textArea);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
