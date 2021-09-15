package ru.mirea.task1.opt1;

public class Main1 {
    public static void main(String[] args) {
        int result = 0;
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
