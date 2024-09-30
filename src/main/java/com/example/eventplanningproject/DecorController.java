package com.example.eventplanningproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class DecorController implements Initializable {

    @FXML
    private VBox box;

    @FXML
    private ImageView img;

    @FXML
    private Label name;

    @FXML
    private CheckBox price;

    public void setData(Decorations decorations){
        Image image = new Image(getClass().getResourceAsStream(decorations.getImageSrc()));
        img.setImage(image);
        name.setText(decorations.getName());
        price.setText(String.valueOf(decorations.getPrice()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
