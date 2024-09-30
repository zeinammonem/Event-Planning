package com.example.eventplanningproject.Server;
/*
import com.example.eventplanningproject.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import static com.example.eventplanningproject.MainPageController.users; //KONT LAZEM A3ML IMPORT LEL ARRAY FROM THE OTHER CLASS

import com.example.eventplanningproject.MainPageController;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Room extends Thread implements Initializable { //initializable: Called to initialize a controller after its root element has been completely processed.


    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public void connectSocket() { //to connect to socket
        try {
            socket = new Socket("locathost", 11111); //creating a socket for client with the same port #11111
            System.out.println("Socket CONNECTED with server!");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //input
            writer = new PrintWriter(socket.getOutputStream(), true); //output
            this.start();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {//keep the infinite loop to keep the connection open
                String message = reader.readLine(); // to read the message that the client is sending
                String[] tokens = message.split(" "); // to split the message into words
                String cmd = tokens[0]; //start at the beginning of the message
                StringBuilder fulmsg = new StringBuilder(); // use the String Builder to append the message back together to send it using ForLoop
                for (int i = 1; i < tokens.length; i++) {
                    fulmsg.append(tokens[i]);
                }
                System.out.println(fulmsg); // printing the full message

                //han3ml if condiotion to see if the client still wants to text or will end the text with "bye"
                if (cmd.equalsIgnoreCase(MainPageController.username + ":")) //han3ml controller class LATER!!!! (CLASS) , ELUSERNAME DA VARIABLE FEL CONTROLLER PAGE
                    continue;
                else if (fulmsg.toString().equalsIgnoreCase("bye")) //ending the convo
                    break;
                msgRoom.appendText(message + "\n"); //textarea for LATER!! (GUI)

            }
            //close kol haga after ending the convo
            reader.close();
            writer.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sendMessage() {
        String message = msgField.getText(); // (GUI STUFF) // el bta3 e bnktb feeha el message (TEXTFIELD)
        writer.println(MainPageController.username + ":" + message); // sned/print the message //CLASS EL CONTROLLER LESSA
        msgRoom.appendText("Me: " + message + "\n"); // el page le feeha el room ->msgRoom
        msgField.setText(""); // benfadeeha hena
        if (message.equalsIgnoreCase("bye"))
            System.exit(0); // ben2fel el chat 5alas
    }

    public void handleSendMessgevent(MouseEvent event) {
        sendMessage();
        for (User user : users) { //msh 3arfa Users de eh???? el mafrood array bs heya defined feeen??
            System.out.println(user.getName());
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //hanshoof han3ml fe eh ba3deen

        clientName.setText(MainPageController.username); //clientname is a label in the Scene builder
        connectSocket();

    }
}

 */
