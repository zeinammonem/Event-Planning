package com.example.eventplanningproject;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

    private ServerSocket serverSocket; //used to listen for incoming connections
    private Socket socket;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader; //read messages from client


    public ServerClass(ServerSocket serverSocket) {


        try {
            this.serverSocket = serverSocket;
            this.socket = serverSocket.accept(); //when it receives a connection , it will create an object that will allow us to communicate withg
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("error creating server");
            e.printStackTrace();
            closeEverything(socket, bufferedReader, bufferedWriter);

        }
    }

    ///////////////////////////////////////////

    //DESIGN PATTERN SINGLETON
    private static ServerClass instance;

    public synchronized static ServerClass getInstance(ServerSocket serverSocket) {
        if (instance == null) {
            instance = new ServerClass(serverSocket);
        }
        return instance;
    }
    ///////////////////////////////////////////


    public void sendMessageToClient(String messageToClient) {

        try {
            bufferedWriter.write(messageToClient);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error sending message to client");
            closeEverything(socket, bufferedReader, bufferedWriter);
        }


    }

    public void receiveMessageFromClient(VBox vbox) { //this method needs to be run on a seperate thread

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()) {
                    try {
                        String messageFromClient = bufferedReader.readLine();
                        MessagerServerController.addLabel(messageFromClient, vbox); //add message to GUI

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
}
