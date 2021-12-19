package ru.mirea.task32;

import java.io.Serializable;
import java.util.ArrayList;

public class SavedUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public User hasUser(User userFind) {
        for (User user : users){
            if (user.equals(userFind)){
                return user;
            }
        }
        return null;
    }

    public void add(User user) {
        users.add(user);
    }
}
