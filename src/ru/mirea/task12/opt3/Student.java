package ru.mirea.task12.opt3;

public class Student {
    private static int count = 0;
    private int id;
    private int score;
    public Student(int score) {
        count++;
        id = count;
        this.score = score;
    }

    public int getID() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score=" + score +
                '}';
    }
}
