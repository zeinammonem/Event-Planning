package com.example.eventplanningproject;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientClass {

    private Socket socket;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    private String username; // take the username from login page to set as page title

    public ClientClass(Socket socket) { //add username in constructor
        this.socket = socket;
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("error creating client");
            e.printStackTrace();
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {

        try {
            if (bufferedReader != null)
                bufferedReader.close();
            if (bufferedWriter != null)
                bufferedWriter.close();
            if (socket != null)
                socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sendMessageToServer(String messageToServer) {
        try {
            bufferedWriter.write(messageToServer);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error sending message to client");
            closeEverything(socket, bufferedReader, bufferedWriter);
        }


    }

    public void receiveMessageFromServer(VBox vBox) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()) {
                    try {
                        String messageFromServer = bufferedReader.readLine();
                        MessagerServerController.addLabel(messageFromServer, vBox); //add message to GUI

                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("error receiving messages from client");
                        closeEverything(socket, bufferedReader, bufferedWriter);
                        break; //to get out of while loop
                    }

                }
            }
        }).start();


    }
}
