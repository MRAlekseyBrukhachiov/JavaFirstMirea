package ru.mirea.task5.opt1;

public class Test {
    public static void main(String[] args) {
        FryingPan fp1 = new FryingPan("Red", "Сast iron", "Tefal", 200.0);
        System.out.println(fp1);
        Pot p1 = new Pot("Black", "Iron", 50.0, "Teflon");
        System.out.println(p1);
        System.out.println(fp1.getColor());
        System.out.println(p1.getMaterial());
    }
}
