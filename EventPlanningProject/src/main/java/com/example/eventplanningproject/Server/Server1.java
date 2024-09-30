package com.example.eventplanningproject.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server1 {


    private static ArrayList<ClientHandler1> clients = new ArrayList<ClientHandler1>(); //TO ADD MULTIPLE CLIENTS TO SERVER

    public static void main(String[] args) {
        ServerSocket serverSocket;//port number to connect client and server together (MAX 32 BIT)
        try {
            serverSocket = new ServerSocket(11111);

            Socket socket; // we use it to listen to when the client is connected

            while (true) { //to keep the connection open for the clients to connect
                System.out.println("WAITING FOR CONNECTION");
                socket = serverSocket.accept(); //client is connected!
                System.out.println("CONNECTED CLIENT!");
                ClientHandler1 clientThread = new ClientHandler1(socket, clients); // create a thread to add feeha el multipe client connections
                clients.add(clientThread); // add new client to array list
                clientThread.start(); //WHHYYYYYY???

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
