package com.example.eventplanningproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class MainPageController {  //hayb2a fxml class for the login in

    public static ArrayList<User> users = new ArrayList<User>(); //ARRAY 2OM EL USERS ZEFT
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}