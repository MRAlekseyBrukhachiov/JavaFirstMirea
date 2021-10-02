package ru.mirea.task12.opt2;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return b.getScore() - a.getScore();
    }
}
