package com.example.eventplanningproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String UserName;

    public Button btnCreateAccount;
    @FXML
    private Label lbl_username;
    @FXML
    private Label lbl_password;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_password;
    @FXML
    private Label lbl_account;
    @FXML
    private Button btn_create;
    @FXML
    private Button btn_login;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnCreateAccount.setOnAction(actionEvent -> {
            DBUtils.changeScene(actionEvent, "Sign-Up.fxml","SignUp", null, null );
        });
        btn_login.setOnAction(actionEvent -> {
            DBUtils.logInUser(actionEvent, tf_username.getText(), tf_password.getText());
            //DBUtils.changeScene(actionEvent,"Decor-Catering.fxml","Options",null,null); //hena 3ashan nerooh to the next page
        });

    }

    /*

    public void setUserInformation(String username){
        UserName=username;

    }

     */

}
