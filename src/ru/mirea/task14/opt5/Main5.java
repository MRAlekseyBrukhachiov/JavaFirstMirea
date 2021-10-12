package ru.mirea.task14.opt5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.Stack;

public class Main5 extends JFrame {
    public JPanel[] pnl = new JPanel[9];
    ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>();
    ArrayDeque<Integer> arr2 = new ArrayDeque<Integer>();
    int count = 0;
    boolean res = false;

    public Main5() {
        super("Drunkard");

        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        /*Scanner in = new Scanner(System.in);
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        for (int i = 0; i < 5; i++) {
            a1[i] = in.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            a2[i] = in.nextInt();
        }*/

        for (int i = 0; i < 5; i++) {
            arr1.addLast(a1[i]);
            arr2.addLast(a2[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridLayout(3,3));
        setLocationRelativeTo(null);
        setVisible(true);

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        JLabel pnl0 = new JLabel(""+arr1.peekFirst());
        JButton pnl1 = new JButton("Сделать ход");
        JLabel pnl2 = new JLabel(""+arr2.peekFirst());
        JLabel pnl3 = new JLabel("Карт в колоде: 5");
        JLabel pnl5 = new JLabel("Карт в колоде: 5");
        JLabel pnl7 = new JLabel("Сделано ходов: 0");
        pnl[0].add(pnl0);
        pnl[1].add(pnl1);
        pnl[2].add(pnl2);
        pnl[3].add(pnl3);
        pnl[5].add(pnl5);
        pnl[7].add(pnl7);

        pnl1.addActionListener(f -> {
            count++;
            Integer el1 = arr1.peekFirst();
            Integer el2 = arr2.peekFirst();
            if (el1 > el2 && (el1 != 9) && (el2 != 0)) {
                arr1.offer(arr1.pollFirst());
                arr1.offer(arr2.pollFirst());
            } else if (el1 < el2 || ((el1 == 9) && (el2 == 0))) {
                arr2.offer(arr1.pollFirst());
                arr2.offer(arr2.pollFirst());
            }

            pnl0.setText(""+arr1.peekFirst());
            pnl2.setText(""+arr2.peekFirst());
            pnl3.setText("Карт в колоде: "+arr1.size());
            pnl5.setText("Карт в колоде: "+arr2.size());

            if (arr1.isEmpty()) {
                pnl7.setText("Игра окончена: second "+count);
                res = true;
            } else if (arr2.isEmpty()) {
                pnl7.setText("Игра окончена: first "+count);
                res = true;
            } else if (count == 106) {
                pnl7.setText("botva");
            } else {
                pnl7.setText("Сделано ходов: "+count);
            }
            pnl1.setEnabled(!res);
        });
    }
    public static void main(String[] args) {
        new Main5();
    }
}
