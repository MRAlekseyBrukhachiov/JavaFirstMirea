package ru.mirea.task32;
import ru.mirea.task32.animations.Shake;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Controller {

    private SavedUsers save;

    @FXML
    private Button allUsersButton;

    @FXML
    private Button authSignInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void initialize() {
        try {
            ObjectInputStream inputStream
                    = new ObjectInputStream(new FileInputStream("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task32\\save.txt"));
            save = (SavedUsers) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        authSignInButton.setOnAction(actionEvent -> {
            try {
                User user = loginUser(loginField.getText(), passwordField.getText());

                if (user != null) {
                    ObjectOutputStream outputStream
                            = new ObjectOutputStream(new FileOutputStream("D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task32\\user.txt"));
                    outputStream.writeObject(user);
                    outputStream.close();

                    Parent root = FXMLLoader.load(getClass().getResource("views/home.fxml"));

                    Stage stage = new Stage();
                    stage.setTitle("Home");
                    stage.setScene(new Scene(root, 700, 400));
                    stage.show();

                    System.out.println("Вы успешно вошли в аккаунт");
                } else {
                    Shake userLoginAnim = new Shake(loginField);
                    Shake userPassAnim = new Shake(passwordField);

                    userLoginAnim.playAnim();
                    userPassAnim.playAnim();

                    System.out.println("Неверный логин или пароль");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        loginSignUpButton.setOnAction(actionEvent -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("views/signUp.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Registration");
                stage.setScene(new Scene(root, 900, 600));
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        allUsersButton.setOnAction(actionEvent -> {
            for (User user: save.getUsers()) {
                System.out.println(user);
            }
        });
    }

    private User loginUser(String login, String password) {
        return save.hasUser(new User(login, password));
    }
}
