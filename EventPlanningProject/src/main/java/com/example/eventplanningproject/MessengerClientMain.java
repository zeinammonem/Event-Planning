package com.example.eventplanningproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;

public class MessengerClientMain extends Application {


    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MessengerClientMain.class.getResource("MessagePageClient.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 478, 396);
        stage.setTitle("Client");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}

