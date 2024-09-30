package com.example.eventplanningproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CheckoutController {

    @FXML
    public Label lbl_savory;
    @FXML
    public Label lbl_dessert;
    @FXML
    public Label lbl_savoryTotal;
    @FXML
    public Label lbl_dessertsTotal;
    @FXML
    public Label lbl_drinks;
    @FXML
    public Label lbl_drinksTotal;
    @FXML
    public Label lbl_totalprice;
    @FXML
    public Label lbl_totalPricDouble;

    public void ChangeLabelSavory(double total){
        lbl_savoryTotal.setText(String.valueOf(total));


    }

    public void ChangeLabelDesserts(double total){
        lbl_dessertsTotal.setText(String.valueOf(total));

    }

    public void ChangeLabelDrinks(double total){
        lbl_drinksTotal.setText(String.valueOf(total));

    }

    public void ChangeDrinks(String title){
        lbl_drinks.setText(title);
        lbl_dessert.setText("");
        lbl_savory.setText("");
        lbl_dessertsTotal.setText("");
        lbl_savoryTotal.setText("");
    }
    public void TotalPrice(double total){
        lbl_totalPricDouble.setText(String.valueOf(total));
    }


}
