package com.example.eventplanningproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DecorPageController implements Initializable {


    @FXML
    private HBox decorlayout;
    private List<Decorations> decorationsList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        decorationsList = new ArrayList<>(decorationsList());
        try {
            for (int i = 0; i < decorationsList.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("decor.fxml"));
                HBox box = fxmlLoader.load();
                DecorController decorController = fxmlLoader.getController();
                decorController.setData(decorationsList.get(i));
                decorlayout.getChildren().add(box);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Decorations> decorationsList(){
        List<Decorations> ls = new ArrayList<>();
        Decorations decorations = new Decorations();
        decorations.setName("Flowers");
        decorations.setImageSrc("/pics/flowers.png");
        decorations.setPrice(3000);
        ls.add(decorations);

        decorations = new Decorations();
        decorations.setName("Balloons");
        decorations.setImageSrc("/pics/balloons.jpg");
        decorations.setPrice(3450);
        ls.add(decorations);

        decorations = new Decorations();
        decorations.setName("Furniture");
        decorations.setImageSrc("/pics/furniture.jpg");
        decorations.setPrice(6749);
        ls.add(decorations);

        decorations = new Decorations();
        decorations.setName("Lights");
        decorations.setImageSrc("/pics/lights.jpg");
        decorations.setPrice(3500);
        ls.add(decorations);

        decorations = new Decorations();
        decorations.setName("DJ");
        decorations.setImageSrc("/pics/dj.jpg");
        decorations.setPrice(7000);
        ls.add(decorations);

        decorations = new Decorations();
        decorations.setName("Photographer");
        decorations.setImageSrc("/pics/photographer.jpg");
        decorations.setPrice(2540);
        ls.add(decorations);


        return ls;
    }

}


