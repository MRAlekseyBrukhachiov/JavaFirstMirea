package ru.mirea.task22;

public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Sit (Chair chair) {
        System.out.println("Вы сели на "+chair.getName());
    }
}
