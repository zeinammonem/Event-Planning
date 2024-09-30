package com.example.eventplanningproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Label lbl_username;
    @FXML
    private TextField tf_username;
    @FXML
    private Label lbl_password;
    @FXML
    private TextField tf_password;
    @FXML
    private Label lbl_email;
    @FXML
    private TextField tf_email;
    @FXML
    private Label lbl_phonenum;
    @FXML
    private TextField tf_phonenum;
    @FXML
    private Button btn_signup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /*
        btn_signup.setOnAction(actionEvent -> {
            DBUtils.signUpUser(actionEvent,tf_username.getText(),tf_password.getText(),tf_email.getText(),Integer.parseInt(tf_phonenum.getText()));
        });

         */

        //changed to el heta de

        btn_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(!tf_username.getText().trim().isEmpty() && !tf_password.getText().trim().isEmpty()){
                    DBUtils.signUpUser(actionEvent,tf_username.getText(),tf_password.getText(),tf_email.getText(),Integer.parseInt(tf_phonenum.getText()));
                }
                else {
                    System.out.println("PLEASE FILL IN ALL INFO");
                    Alert alert= new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill all info to sign up");
                    alert.show();

                }

            }
        });





    }

}
