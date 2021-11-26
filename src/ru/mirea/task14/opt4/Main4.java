package ru.mirea.task14.opt4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};

        List<Double> a = new LinkedList<>();
        List<Double> b = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            a.add((double) a1[i]);
            b.add((double) a2[i]);
        }

        Collections.reverse(a);
        Collections.reverse(b);

        boolean fin = false;
        int count = 0;
        for (int i = 0; i < 106; i++) {
            count++;
            if (a.get(0) == 0 && b.get(0) == 9) {
                a.add(a.get(0));
                a.add(b.get(0));
            } else if (a.get(0) == 9 && b.get(0) == 0) {
                b.add(a.get(0));
                b.add(b.get(0));
            } else if (a.get(0) > b.get(0)) {
                a.add(a.get(0));
                a.add(b.get(0));
            }
            if (a.get(0) < b.get(0)) {
                b.add(a.get(0));
                b.add(b.get(0));
            }
            a.remove(0);
            b.remove(0);

            if (a.isEmpty()) {
                System.out.println("second " + count);
                fin = true;
                break;
            }

            if (b.isEmpty()) {
                System.out.println("first " + count);
                fin = true;
                break;
            }
        }

        if (!fin)
            System.out.println("botva");
    }
}

