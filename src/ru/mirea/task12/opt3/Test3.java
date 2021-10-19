package ru.mirea.task12.opt3;

public class Test3 {
    public static Student[] sortByMerge(Student[] a) {
        if (a == null)
            return null;
        if (a.length < 2)
            return a;
        Student[] b = new Student[a.length / 2];
        System.arraycopy(a, 0, b, 0, a.length / 2);
        Student[] c = new Student[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, c, 0, a.length - a.length / 2);
        b = sortByMerge(b);
        c = sortByMerge(c);
        return mergeArrays(b, c);
    }

    public static Student[] mergeArrays(Student[] a, Student[] b) {
        Student[] c = new Student[a.length + b.length];
        int apos = 0, bpos = 0;
        for (int i = 0; i < c.length; i++) {
            if (apos == a.length) {
                c[i] = b[bpos];
                bpos++;
            } else if (bpos == b.length) {
                c[i] = a[apos];
                apos++;
            } else if (a[apos].getScore() < b[bpos].getScore()) {
                c[i] = a[apos];
                apos++;
            } else {
                c[i] = b[bpos];
                bpos++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Student[] a = new Student[10];
        Student[] b = new Student[10];
        Student[] c;
        for (int i = 0; i < 10; i++) {
            a[i] = new Student((int) (Math.random() * 100));
            System.out.print(a[i].getScore() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            b[i] = new Student((int) (Math.random() * 100));
            System.out.print(b[i].getScore() + " ");
        }

        a = sortByMerge(a);
        b = sortByMerge(b);
        c = mergeArrays(a, b);

        System.out.println();
        for (int i = 0; i < 20; i++)
            System.out.print(c[i] + "\n");
    }
}

