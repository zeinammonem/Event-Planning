package com.example.eventplanningproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class MessengerServerMain extends Application {


    public void start(Stage stage) throws IOException {



        FXMLLoader fxmlLoader = new FXMLLoader(MessengerServerMain.class.getResource("MessagePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 478, 396);
        stage.setTitle("5edmet 3omala");
        stage.setScene(scene);
        stage.show();




    }


    public static void main(String[] args) throws IOException {


        launch();

    }


}
