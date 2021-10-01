package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Task2 extends JFrame {
    public JPanel north = new JPanel();
    public JPanel center = new JPanel();
    public JPanel south = new JPanel();
    public JPanel west = new JPanel();
    public JPanel east = new JPanel();

    public Task2() {
        super("Text Area");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);

        north.setBackground(Color.blue);
        north.setPreferredSize(new Dimension(50,50));
        JLabel jNorth = new JLabel("Москва");
        north.add(jNorth);

        south.setBackground(Color.red);
        south.setPreferredSize(new Dimension(50,50));
        JLabel jSouth = new JLabel("Саратов");
        south.add(jSouth);

        center.setBackground(Color.yellow);
        JLabel jCenter = new JLabel("Кузнецк");
        center.add(jCenter);

        west.setBackground(Color.green);
        west.setPreferredSize(new Dimension(190,50));
        JLabel jWest = new JLabel("Пенза");
        west.add(jWest);

        east.setBackground(Color.gray);
        east.setPreferredSize(new Dimension(190,50));
        JLabel jEast = new JLabel("Самара");
        east.add(jEast);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);

        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jNorth.setText("Добро пожаловать в Москву");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jNorth.setText("Москва");
            }
        });
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jWest.setText("Добро пожаловать в Пензу");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jWest.setText("Пенза");
            }
        });
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jCenter.setText("Добро пожаловать в Кузнецк");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jCenter.setText("Кузнецк");
            }
        });
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jSouth.setText("Добро пожаловать в Саратов");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jSouth.setText("Саратов");
            }
        });
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jEast.setText("Добро пожаловать в Самару");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jEast.setText("Самара");
            }
        });
    }

    public static void main(String[] args) {
        new Task2();
    }
}
