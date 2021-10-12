package ru.mirea.task14.opt2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
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

        Queue<Integer> arr1 = new LinkedList<>();
        Queue<Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            arr1.offer(a1[i]);
            arr2.offer(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.element() > arr2.element() && (arr1.element() != 9) && (arr2.element() != 0)) {
                arr1.offer(arr1.poll());
                arr1.offer(arr2.poll());
            } else if (arr1.element() < arr2.element() || ((arr1.element() == 9) && (arr2.element() == 0))) {
                arr2.offer(arr1.poll());
                arr2.offer(arr2.poll());
            }

            if (arr1.isEmpty()) {
                System.out.println("second " + count);
                res = true;
                break;
            } else if (arr2.isEmpty()) {
                System.out.println("first " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("botva");
    }
}
