package ru.mirea.task12.opt1;

public class Test1 {
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].getID() > temp.getID()) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student((int)(Math.random()*100));
            System.out.println("Student "+i+": "+students[i].getID());
        }
        insertionSort(students);
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
