package ru.mirea.task32;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;

public class HomeController {

    private User user;

    @FXML
    private Label userAge;

    @FXML
    private Label userDateRegistration;

    @FXML
    private ImageView userFavoriteGame;

    @FXML
    private Label userName;

    @FXML
    private Label userSex;

    @FXML
    void initialize() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            ObjectInputStream inputStream
                    = new ObjectInputStream(new FileInputStream("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task32\\user.txt"));
            user = (User) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        userName.setText(user.getName()+" "+user.getSurname());
        userAge.setText("Возраст: "+user.getAge());
        userDateRegistration.setText("Дата регистрации: "+dateFormat.format(user.getDate().getTime()));

        if (user.getSex() == Sex.MALE) {
            userSex.setText("Пол: Мужской");
        } else {
            userSex.setText("Пол: Женский");
        }

        InputStream iconStream = getClass().getResourceAsStream("assets/GOW.png");

        if (user.getGame() == Game.TLOU) {
            iconStream = getClass().getResourceAsStream("assets/TLOU.png");
        } else if (user.getGame() == Game.Uncharted) {
            iconStream = getClass().getResourceAsStream("assets/Uncharted.png");
        }

        userFavoriteGame.setImage(new Image(iconStream));
    }
}
