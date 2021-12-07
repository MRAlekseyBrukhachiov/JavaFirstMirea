package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class Metro {
    List<MetroLine> metro = new ArrayList<>();

    public void PrintList (boolean a) {
        if (a) {
            for (int i = 0; i < metro.size(); i++) {
                if (i % 2 == 0)
                    System.out.println(metro.get(i));
            }
        } else {
            for (int i = 0; i < metro.size(); i++) {
                if (i % 2 != 0)
                    System.out.println(metro.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Metro Moscow = new Metro();

        MetroLine m1 = new MetroLine(1, "Сокольническая", "Red");
        MetroLine m2 = new MetroLine(2, "Замоскворецкая", "Green");
        MetroLine m3 = new MetroLine(3, "Арбатско-Покровская", "Blue");
        MetroLine m4 = new MetroLine(4, "Филёвская", "Light blue");
        MetroLine m5 = new MetroLine(5, "Кольцевая", "Brown");
        MetroLine m6 = new MetroLine(6, "Калужско-Рижская", "Orange");
        MetroLine m7 = new MetroLine(7, "Таганско-Краснопресненская", "Purple");
        MetroLine m8 = new MetroLine(8, "Калининская", "Yellow");
        MetroLine m9 = new MetroLine(9, "Серпуховско-Тимирязевская", "Grey");
        MetroLine m10 = new MetroLine(10, "Люблинская", "Lime");
        MetroLine m11 = new MetroLine(11, "Каховская", "Teal");
        MetroLine m12 = new MetroLine(12, "Бутовская", "Blue grey");

        Moscow.metro.add(m1);
        Moscow.metro.add(m2);
        Moscow.metro.add(m3);
        Moscow.metro.add(m4);
        Moscow.metro.add(m5);
        Moscow.metro.add(m6);
        Moscow.metro.add(m7);
        Moscow.metro.add(m8);
        Moscow.metro.add(m9);
        Moscow.metro.add(m10);
        Moscow.metro.add(m11);
        Moscow.metro.add(m12);

        Moscow.PrintList(true);
        System.out.println();
        Moscow.PrintList(false);
    }
}
