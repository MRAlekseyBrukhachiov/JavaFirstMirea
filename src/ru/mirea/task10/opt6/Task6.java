package ru.mirea.task10.opt6;
import java.util.Scanner;

public class Task6 {
    public static boolean fun (int n, int del){
        if(del > n / 2)
            return true;
        return (n % del != 0) ? fun(n,++del) : false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        int n = in.nextInt();
        if (fun(n, 2) && n != 0 && n != 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
