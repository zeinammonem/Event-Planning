package com.example.eventplanningproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label lbl_hello;
    @FXML
    private Text t_description;
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_signup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_login.setOnAction(ActionEvent->{
            DBUtils.changeScene(new ActionEvent(), "Logged-In,fxml", "LogIn",null, null);
        });

        btn_signup.setOnAction(ActionEvent->{
            DBUtils.changeScene(new ActionEvent(),"Sign-Up.fxml", "SignUp", null, null);
        });
    }
}