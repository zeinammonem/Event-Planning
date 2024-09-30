package com.example.eventplanningproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class SceneChangeControl implements Initializable { //HAYB2A FEE KOL EL CONTROLS FOR THE FXML FILES

    //DECOR-CATERING PAGE
    @FXML
    public Button btn_catering;
    @FXML
    public Button btn_decor;

    //DECOR PAGE
    @FXML
    public CheckBox chk_flowers;
    @FXML
    public CheckBox chk_lights;
    @FXML
    public CheckBox chk_dj;
    @FXML
    public CheckBox chk_furniture;
    @FXML
    public CheckBox chk_photographer;
    @FXML
    public CheckBox chk_balloons;
    @FXML
    public Button btn_checkoutDecor;
    @FXML
    public Button btn_backDecor;

    //savory
    @FXML
    public TextField btn_rice;
    @FXML
    public TextField btn_pasta;
    @FXML
    public TextField btn_pastries;
    @FXML
    public TextField btn_pizza;
    @FXML
    public TextField btn_sandwiches;
    @FXML
    public TextField btn_grills;
    @FXML
    public TextField btn_seafood;
    @FXML
    public TextField btn_salad;
    @FXML
    public TextField btn_sushi;
    @FXML
    public TextField btn_friedChicken;

    //desserts
    @FXML
    public TextField btn_chocolates;
    @FXML
    public TextField btn_icecream;
    @FXML
    public TextField btn_cupcake;
    @FXML
    public TextField btn_cheesecake;
    @FXML
    public TextField btn_cake;
    @FXML
    public TextField btn_candies;
    @FXML
    public TextField btn_cookies;
    @FXML
    public TextField btn_tart;

    //drinks
    @FXML
    public TextField btn_cocktails;
    @FXML
    public TextField btn_freshjuice;
    @FXML
    public TextField tn_coffee;
    @FXML
    public TextField btn_tea;
    @FXML
    public TextField btn_soda;
    @FXML
    public TextField btn_alcohols;

    //checkout page
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


    private Parent root;
    private Scene scene;
    private Stage stage;

    ArrayList<CheckBox> chk = new ArrayList<>();
    ArrayList<Boolean> bool = new ArrayList<>();
    ArrayList<Integer> savoryNum= new ArrayList<>();
    ArrayList<Integer> dessertNum=new ArrayList<>();
    ArrayList<Integer> drinkstNum=new ArrayList<>();



    public ArrayList<String> DecorReceipt= new ArrayList<>();
    public ArrayList<String> SavoryReceipt= new ArrayList<>();
    public ArrayList<String> DessertsReceipt= new ArrayList<>();
    public ArrayList<String> DrinksReceipt= new ArrayList<>();

    String printSavory;







    public void sceneSwitchtoDecor(ActionEvent actionEvent) throws IOException {
        stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("DecorPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Decor Page");
        stage.setScene(scene);
        stage.show();

        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("Decor-CateringPage.fxml"));
        Scene scene1 = new Scene(root1);

        stage1.setScene(scene1);
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();


    }

    public void sceneSwitchtoCatering(ActionEvent actionEvent) throws IOException {
        stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CateringPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Catering Page");
        stage.setScene(scene);
        stage.show();

        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("Decor-CateringPage.fxml"));
        Scene scene1 = new Scene(root1);

        stage1.setScene(scene1);
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    //for decor
    public void sceneSwitchDecorOrCatering_Decor(ActionEvent actionEvent) throws IOException {
        stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Decor-CateringPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Decor Page");
        stage.setScene(scene);
        stage.show();



        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("DecorPage.fxml"));
        Scene scene1 = new Scene(root1);

        stage1.setScene(scene1);
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();

    }

    public void sceneSwitchDecorOrCatering_Catering(ActionEvent actionEvent) throws IOException {
        stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Decor-CateringPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Decor Page");
        stage.setScene(scene);
        stage.show();



        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("DecorPage.fxml"));
        Scene scene1 = new Scene(root1);

        stage1.setScene(scene1);
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();

    }



    //DECOR BUTTON
    public void checkoutDecor(ActionEvent actionEvent) throws IOException {

        chk.add(chk_dj);
        chk.add(chk_lights);
        chk.add(chk_photographer);
        chk.add(chk_flowers);
        chk.add(chk_balloons);
        chk.add(chk_furniture);

        for(int i=0;i<6;i++){
            if(chk.get(i).isSelected())
                bool.add(true);
            else
                bool.add(false);
        }

        Decorations decorations = new Decorations(bool);
        double totalDecor=decorations.TotalPriceDecor();


        for(int i=0;i<chk.size();i++){//print in terminal
            if(bool.get(i)==true){
                DecorReceipt.add(decorations.DecorPrint[i]);
                System.out.println(decorations.DecorPrint[i]);

            }



        }

        System.out.println(decorations.TotalPriceDecor());

        CheckOut checkOut= new CheckOut(0,0,0,totalDecor);


        FXMLLoader loader = new FXMLLoader(getClass().getResource("Checkout.fxml"));
        root=loader.load();
        CheckoutController checkoutController= loader.getController();
        checkoutController.ChangeDrinks("Decor");
        checkoutController.ChangeLabelDrinks(totalDecor);

        checkoutController.TotalPrice(checkOut.CalculateCheckout());


        stage = new Stage();
        //Parent root = FXMLLoader.load(getClass().getResource("Checkout.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Checkout Page");
        stage.setScene(scene);

        stage.show();

        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("DecorPage.fxml"));
        Scene scene1 = new Scene(root1);

        stage1.setScene(scene1);
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();



    }

    public void CheckoutCatering(ActionEvent actionEvent)throws IOException{

        savoryNum.add(Integer.parseInt(btn_sushi.getText()));
        savoryNum.add(Integer.parseInt(btn_sandwiches.getText()));
        savoryNum.add(Integer.parseInt(btn_friedChicken.getText()));
        savoryNum.add(Integer.parseInt(btn_pastries.getText()));
        savoryNum.add(Integer.parseInt(btn_pasta.getText()));
        savoryNum.add(Integer.parseInt(btn_salad.getText()));
        savoryNum.add(Integer.parseInt(btn_rice.getText()));
        savoryNum.add(Integer.parseInt(btn_seafood.getText()));
        savoryNum.add(Integer.parseInt(btn_grills.getText()));
        savoryNum.add(Integer.parseInt(btn_pizza.getText()));


        //savory
        Savory savory = new Savory(savoryNum);
        double totalSavory=savory.TotalPriceFood();

        for(int i=0;i<savoryNum.size();i++){
            if(savoryNum.get(i)>0){
                SavoryReceipt.add(savory.SavoryPrint[i]);
            }

        }
        System.out.println(SavoryReceipt);
        System.out.println(totalSavory);

        //desserts
        dessertNum.add(Integer.parseInt(btn_cake.getText()));
        dessertNum.add(Integer.parseInt(btn_cupcake.getText()));
        dessertNum.add(Integer.parseInt(btn_cheesecake.getText()));
        dessertNum.add(Integer.parseInt(btn_tart.getText()));
        dessertNum.add(Integer.parseInt(btn_cookies.getText()));
        dessertNum.add(Integer.parseInt(btn_chocolates.getText()));
        dessertNum.add(Integer.parseInt(btn_icecream.getText()));

        Dessert dessert= new Dessert(dessertNum);
        double totalDessert=dessert.TotalPriceFood();

        for(int i=0;i<dessertNum.size();i++){
            if(dessertNum.get(i)>0){
                DessertsReceipt.add(dessert.dessertPrint[i]);
            }

        }
        System.out.println(DessertsReceipt);
        System.out.println(totalDessert);

        //drinks
        drinkstNum.add(Integer.parseInt(btn_soda.getText()));
        drinkstNum.add(Integer.parseInt(btn_freshjuice.getText()));
        drinkstNum.add(Integer.parseInt(tn_coffee.getText()));
        drinkstNum.add(Integer.parseInt(btn_cocktails.getText()));
        drinkstNum.add(Integer.parseInt(btn_tea.getText()));
        drinkstNum.add(Integer.parseInt(btn_alcohols.getText()));



        Drinks drinks=new Drinks(drinkstNum);
        double totalDrinks=drinks.TotalPriceDrinks();

        for(int i=0;i<drinkstNum.size();i++){
            if(drinkstNum.get(i)>0){
                DrinksReceipt.add(drinks.drinksPrirnt[i]);
            }

        }
        System.out.println(DrinksReceipt);
        System.out.println(totalDrinks);

        CheckOut checkOut = new CheckOut(totalSavory,totalDessert,totalDrinks,0);
        checkOut.CalculateCheckout();






        FXMLLoader loader = new FXMLLoader(getClass().getResource("Checkout.fxml"));
        root=loader.load();
        CheckoutController checkoutController= loader.getController();
        checkoutController.ChangeLabelSavory(totalSavory);
        checkoutController.ChangeLabelDrinks(totalDrinks);
        checkoutController.ChangeLabelDesserts(totalDessert);
        checkoutController.TotalPrice(checkOut.CalculateCheckout());




        stage = new Stage();
        //Parent root = FXMLLoader.load(getClass().getResource("Checkout.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Checkout Page");
        stage.setScene(scene);

        stage.show();

        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("CateringPage.fxml"));
        Scene scene1 = new Scene(root1);

        stage1.setScene(scene1);
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();


    }


}



