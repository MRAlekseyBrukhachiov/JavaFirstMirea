package ru.mirea.task29;

import java.io.Serializable;
import java.util.ArrayList;

public class SavedUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<User> users = new ArrayList<User>();

    public SavedUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
