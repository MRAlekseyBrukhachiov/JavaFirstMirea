package ru.mirea.task10.opt4;
import java.util.Scanner;
import java.lang.Math.*;
public class Task4 {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("K: ");
        int k = in.nextInt();

        System.out.println("S: ");
        int s = in.nextInt();

        int i = (int)(Math.pow(10, k - 1));
        while (i < (int)(Math.pow(10, k))) {
            int ssum = 0, num = i;

            while (num != 0) {
                ssum += num % 10;
                num /= 10;
            }

            if (ssum == s) {
                System.out.println(i);
                cnt++;
            }
            i++;
        }
        System.out.println("Count of this numbers: "+cnt);
    }

}
