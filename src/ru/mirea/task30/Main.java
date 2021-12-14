package ru.mirea.task30;

public class Main {
    public static void main(String[] args) {
        new User("Алексей", "Брюхачёв", 19);
        new User("Шамиль", "Шундалов", 20);
        new User("Артур", "Лизунов", 21);

        System.out.println("Все пользователи:");
        User.getUsers().forEach(System.out::println);
        System.out.println("всех пользователей: " + User.getCount());
        System.out.println("общий возраст всех пользователей: " + User.getAllAgeUsers());
        System.out.println("средний возраст всех пользователей: " + User.getAverageAgeOfAllUsers());
    }
}
