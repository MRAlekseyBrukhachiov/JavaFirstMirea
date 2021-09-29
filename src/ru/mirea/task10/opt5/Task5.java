package ru.mirea.task10.opt5;
import java.util.Scanner;

public class Task5 {
    public static int sumOfDigits(int N){
        if (N == 0)
            return 0;
        else
            return N%10+sumOfDigits(N/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(sumOfDigits(N));
    }
}
