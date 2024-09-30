package com.example.eventplanningproject.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler1 extends Thread {

    private ArrayList<ClientHandler1> clients;
    private Socket socket;
    private BufferedReader reader;  // read message that is sent from client
    private PrintWriter writer;

    public ClientHandler1(Socket socket, ArrayList<ClientHandler1> clients) {
        try {
            this.clients = clients;
            this.socket = socket;
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // input stream reader reads 1char, put in buffer reader to read all char
            this.writer = new PrintWriter(socket.getOutputStream(), true); //to get the message from server
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = reader.readLine()) != null) { //message msh fadya

                if (message.equalsIgnoreCase("exit")) { //it compares 2 strings if the are equal , ignoring law howa upper case aw lower case
                    break;
                }
                for (ClientHandler1 clientHandler : clients) { //to see which client is sending the message
                    clientHandler.writer.println(message); // we print el message
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { //we have to close the thread when exiting!!!
                reader.close();
                writer.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
