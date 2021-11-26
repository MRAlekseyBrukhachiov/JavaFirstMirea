package ru.mirea.task20;
import java.text.SimpleDateFormat;
import java.util.*;
public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Calendar> dates = new ArrayList<Calendar>();

        System.out.println("Введите количество пользователей: ");
        int numOfUsers = in.nextInt();

        System.out.println("|*****РЕГИСТРАЦИЯ*****|");
        for (int i = 0; i < numOfUsers; i++) {
            System.out.println("Введите имя и фамилию: ");
            String name = in.next();
            String surname = in.next();
            User user = new User(name, surname);
            Calendar date = new GregorianCalendar();
            users.add(user);
            dates.add(date);
        }

        System.out.println();
        System.out.println("|*****СПИСОК ПОЛЬЗОВАТЕЛЕЙ*****|");
        for (int i = 0; i < users.size(); i++){
            System.out.println(users.get(i));
            System.out.println("Registration: "+dateFormat.format(dates.get(i).getTime()));
        }
    }
}
