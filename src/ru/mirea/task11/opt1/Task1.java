package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame{
    private int value, numOfAttempts = 3;
    private JButton button = new JButton("Enter");
    private JTextField textValue = new JTextField(10);
    private JLabel message = new JLabel("У вас 3 попытки");

    private String check(int enterValue) {
        String info;
        if (enterValue > value) {
            info = "Число меньше";
        } else {
            info = "Число больше";
        }
        return info;
    }

    public Task1(int value){
        super("Guessing-Game");
        this.value = value;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(200, 100);
        setLocationRelativeTo(null);

        add(button);
        add(textValue);
        add(message);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int enterValue = Integer.parseInt(textValue.getText());
                    if (enterValue != value) {
                        numOfAttempts--;
                        if(numOfAttempts == 0){
                            message.setText("GAME OVER");
                        } else {
                            message.setText("Попыток: "+numOfAttempts+" ("+check(enterValue)+")");
                        }
                    } else {
                        message.setText("YOU WIN!");
                    }
                }
                catch (NumberFormatException ex) {
                    message.setText("Ошибка! Введите число");
                }
            }
        });
    }

    public static void main(String[] args) {
        int value = (int)(Math.random()*20);
        new Task1(value);
        System.out.println(value);
    }
}
