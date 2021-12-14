package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class UserTest {

    private User user;
    private User user1;
    private User user2;

    @Before
    public void setUp() throws Exception {
        user = new User("Алексей", "Брюхачёв", 19);
        user1 = new User("Шамиль", "Шундалов", 20);
        user2 = new User("Артур", "Лизунов", 21);
    }

    @Test
    public void getAllUsers() {
        ArrayList<User> expected = User.getUsers();
        ArrayList<User> actual = new ArrayList<>();

        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 1 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getUsers();
        Assert.assertNotNull(expected);

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 2 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getCount();
        int actual = 3;

        Assert.assertEquals(expected, actual);

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 3 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void newUser_EMPTY_NAME() {

        for (User user : User.getUsers()){
            if (user.getName() != null && user.getName().isEmpty()) {
                Assert.fail("Попытка создания пользователя с пустым именем");
            }
        }

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 4 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void GetAllAgeUsers() {
        int expected = User.getAllAgeUsers();
        int actual = 19 + 20 + 21;

        Assert.assertEquals(expected, actual);

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 5 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getAverageAgeOfAllUsers() {
        int expected = User.getAverageAgeOfAllUsers();
        int actual = (19 + 20 + 21) / 3;

        Assert.assertEquals(expected, actual);

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 6 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void newUser_AGE_ZERO() {
        for (User user : User.getUsers()) {
            if (user.getAge() <= 0) {
                Assert.fail("Попытка создания пользователя c не допустимым возрастом");
            }
        }

        try (FileWriter file
                     = new FileWriter("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            file.write("Test 7 passed - "+dateFormat.format(new GregorianCalendar().getTime())+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}