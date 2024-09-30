package com.example.eventplanningproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.sql.*;



import java.io.IOException;

public class DBUtils {


    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String password){
        Parent root = null;

        if(username!= null && password != null){ //if there is a name and password
            try {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root = loader.load();
                //root= FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
                //LoggedInController loggedInController = loader.getController();
                //loggedInController.setUserName(username); //changed the method to setter and getter
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{ //if there isnt a name and password
            try {
                root = FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //changing the scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene((new Scene(root, 770,500)));
        stage.show();
    }

    public static void signUpUser(ActionEvent event, String username, String password, String email, int phoneNum){
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx", "root", "toor"); //hena change ur password  AND THE NAME OF THE FILE ana 3andy (loginuser enty i guess javafx)!!
            psCheckUserExists = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            psCheckUserExists.setString(1, username);
            resultSet = psCheckUserExists.executeQuery();

            if(resultSet.isBeforeFirst()){ //to check if the result is empty
                System.out.println("User already exists!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this username.");
                alert.show();
            }
            else{
                psInsert = connection.prepareStatement("INSERT INTO users (username, password, email, phonenumber) VALUES (?, ?, ?, ?)"); //YOU FORGOT TO PUT THIS LINE
                psInsert.setString(1, username);
                psInsert.setString(2, password);
                psInsert.setString(3, email);
                psInsert.setInt(4, phoneNum);
                psInsert.executeUpdate();

                changeScene(event,"Decor-CateringPage.fxml","Decor or Catering",username,password); //YOU FORGOT THIS
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally { //ALWAYS CLOSE THE DATABASE
            if(resultSet != null){
                try{
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psCheckUserExists != null){
                try {
                    psCheckUserExists.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psInsert != null){
                try{
                    psInsert.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void logInUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx", "root", "toor"); //hena change ur password  AND THE NAME OF THE FILE ana 3andy (loginuser enty i guess javafx)!!
            preparedStatement = connection.prepareStatement("SELECT password FROM users WHERE username = ?"); //HENA ENTY KONTY KATBAHA 8ALAT
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.isBeforeFirst()) { //user not found
                System.out.println("User not found in the database!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided credentials are incorrect!");
                alert.show();
            } else {//if the user is found
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");
                    if (retrievedPassword.equals(password)) {
                        changeScene(event, "Decor-CateringPage.fxml", "Decor or Catering", username, password); //just changed to DBUtils.changeScene
                    } else {
                        System.out.println("Password did not match!");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Provided credentials are incorrect!");
                        alert.show();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //konty hata wahda connection extra
        }
    }
}
