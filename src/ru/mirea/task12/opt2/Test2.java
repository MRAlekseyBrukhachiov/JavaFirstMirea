package ru.mirea.task12.opt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student((int)(Math.random()*100));
            students.add(student);
            System.out.println(student);
        }
        Comparator scoreComparator = new SortingStudentsByGPA();
        Collections.sort(students, scoreComparator);
        System.out.println();
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
