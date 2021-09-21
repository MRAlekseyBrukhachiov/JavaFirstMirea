package ru.mirea.task3.opt2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human('M', "Peter", 40, 110, 42);
        System.out.println(human);
        human.setGender('F');
        human.setIq(90);
        human.setName("Alice");
        human.setSizeLeg(38);
        System.out.println(human);
        System.out.println(human.getHand(true));
    }
}
