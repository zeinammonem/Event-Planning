package com.example.eventplanningproject;

public class CheckOut {

    private double totalPriceSavory;
    private double totalPriceDessert;
    private double totalPriceDecorations;
    private double totalPriceDrinks;


    public CheckOut(double totalPriceSavory, double totalPriceDessert, double totalPriceDecorations, double totalPriceDrinks) {
        this.totalPriceSavory = totalPriceSavory;
        this.totalPriceDessert = totalPriceDessert;
        this.totalPriceDecorations = totalPriceDecorations;
        this.totalPriceDrinks = totalPriceDrinks;

    }

    public double CalculateCheckout() {
        return totalPriceSavory + totalPriceDessert + totalPriceDecorations + totalPriceDrinks;
    }
}
