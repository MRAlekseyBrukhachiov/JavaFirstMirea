package ru.mirea.task32;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import ru.mirea.task32.animations.*;

import java.io.*;

public class SignUpController {

    private User user = new User();

    @FXML
    private TextField ageField;

    @FXML
    private CheckBox checkBoxFemale;

    @FXML
    private CheckBox checkBoxMale;

    @FXML
    private TextField loginField;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField surnameField;

    @FXML
    private ImageView imageGOW;

    @FXML
    private ImageView imageTLOU;

    @FXML
    private ImageView imageUncharted;

    @FXML
    void initialize() {
        checkBoxMale.setOnAction(actionEvent -> {
            checkBoxFemale.setSelected(false);
        });

        checkBoxFemale.setOnAction(actionEvent -> {
            checkBoxMale.setSelected(false);
        });

        signUpButton.setOnAction(actionEvent -> {
            Sex sex;

            if (checkBoxMale.isSelected()) {
                sex = Sex.MALE;
            } else {
                sex = Sex.FEMALE;
            }

            user.setName(nameField.getText());
            user.setSurname(surnameField.getText());
            user.setAge(Integer.parseInt(ageField.getText()));
            user.setLogin(loginField.getText());
            user.setPassword(passwordField.getText());
            user.setSex(sex);

            try {
                String path = "D:\\Программирование на Java (2 курс)\\JavaFirstMirea\\src\\ru\\mirea\\task32\\save.txt";

                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
                SavedUsers save = (SavedUsers) inputStream.readObject();
                //SavedUsers save = new SavedUsers();
                save.add(user);

                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));

                outputStream.writeObject(save);
                outputStream.close();

                Parent root = FXMLLoader.load(getClass().getResource("views/sample.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Game Social");
                stage.setScene(new Scene(root, 700, 400));
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        imageGOW.setOnMouseClicked(mouseEvent -> {
            Shake userImageAnim = new Shake(imageGOW);
            Game game = Game.GodOfWar;
            user.setGame(game);
            userImageAnim.playAnim();
        });

        imageTLOU.setOnMouseClicked(mouseEvent -> {
            Shake userImageAnim = new Shake(imageTLOU);
            Game game = Game.TLOU;
            user.setGame(game);
            userImageAnim.playAnim();
        });

        imageUncharted.setOnMouseClicked(mouseEvent -> {
            Shake userImageAnim = new Shake(imageUncharted);
            Game game = Game.Uncharted;
            user.setGame(game);
            userImageAnim.playAnim();
        });
    }
}
