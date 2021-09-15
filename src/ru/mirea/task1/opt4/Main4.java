package ru.mirea.task1.opt4;
import java.util.Scanner;
import java.lang.Math.*;
import java.util.Random;
import java.util.Arrays;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("1) Math.random()");
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println();
        for (int arr: array) {
            System.out.print(arr+" ");
        }
        System.out.println("\n"+"2) Random");
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println();
        for (int arr: array) {
            System.out.print(arr+" ");
        }
    }
}
