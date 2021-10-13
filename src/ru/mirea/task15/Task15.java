package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            ///1
            FileWriter writer = new FileWriter("Text.txt", false);
            writer.write(text);
            writer.close();
            ///2
            FileReader reader = new FileReader("Text.txt");
            int c;
            while ((c = reader.read()) != - 1) {
                System.out.print((char) c);
            }
            writer.close();
            System.out.println('\n');
            ///3
            FileWriter writer1 = new FileWriter("Text.txt", false);
            text = in.nextLine();
            writer1.write(text);
            writer1.close();
            ///4
            FileWriter writer2 = new FileWriter("Text.txt", true);
            text = in.nextLine();
            writer2.append(' ');
            writer2.write(text);
            writer2.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
