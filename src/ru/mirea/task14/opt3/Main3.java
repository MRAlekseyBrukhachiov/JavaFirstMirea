package ru.mirea.task14.opt3;

import java.util.ArrayDeque;

public class Main3 {
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

        ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> arr2 = new ArrayDeque<Integer>();
        for (int i = 0; i < 5; i++) {
            arr1.addLast(a1[i]);
            arr2.addLast(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            Integer el1 = arr1.peekFirst();
            Integer el2 = arr2.peekFirst();
            if (el1 > el2 && (el1 != 9) && (el2 != 0)) {
                arr1.offer(arr1.pollLast());
                arr1.offer(arr2.pollLast());
            } else if (el1 < el2 || ((el1 == 9) && (el2 == 0))) {
                arr2.offer(arr1.pollLast());
                arr2.offer(arr2.pollLast());
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
