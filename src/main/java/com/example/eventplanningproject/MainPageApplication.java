package com.example.eventplanningproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        //welcome page
        FXMLLoader fxmlLoader = new FXMLLoader(MainPageApplication.class.getResource("Logged-In.fxml")); //da hayfta7 el logged in page w law enty 3ayza to sign up
        Scene scene = new Scene(fxmlLoader.load(), 770, 500);
        stage.setTitle("Event Planning");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}