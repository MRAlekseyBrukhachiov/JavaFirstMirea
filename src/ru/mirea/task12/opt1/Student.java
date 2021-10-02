package ru.mirea.task12.opt1;

public class Student {
    private int ID;

    public Student(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                '}';
    }
}
