package ru.mirea.task1.opt5;

public class Main5 {
    public static int factorial(int a) {
        if (a < 0) {
            return a;
        }
        int result = 1;
        for (; a > 1; result *= a, a--) ;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
        System.out.println(factorial(-120));
    }
}
