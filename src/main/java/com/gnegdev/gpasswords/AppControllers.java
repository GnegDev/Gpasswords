package com.gnegdev.gpasswords;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class AppControllers {
    @FXML
    private Slider lengthSelector;
    @FXML
    private CheckBox numbersCharsSelector;
    @FXML
    private CheckBox upperCharsSelector;
    @FXML
    private CheckBox specialCharsSelector;
    @FXML
    private TextField passwordOutput;

    @FXML
    protected void generatePassword() {
        passwordOutput.setText(PasswordGenerator.generateRandomPassword((int) lengthSelector.getValue(), numbersCharsSelector.isSelected(), upperCharsSelector.isSelected(), specialCharsSelector.isSelected()));
    }

    @FXML
    protected void showInfo() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gpasswords");
        alert.setHeaderText("Gpasswords v1.0.0");
        alert.setContentText("By Ivan Valtuille\n\n2023 GnegDev");

        alert.showAndWait();
    }
/*
    @FXML
    protected void
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
}
