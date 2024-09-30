package com.example.eventplanningproject;

import java.util.ArrayList;

public class Drinks {

    private double soda = 30;
    private double freshJuice = 40;
    private double coffee = 50;
    private double cocktails = 65;
    private double herbs = 30;
    private double tea = 30;
    private double alcohols = 500;

    private double sodaNum;
    private double freshJuiceNum;
    private double coffeeNum;
    private double cocktailsNum;
    private double herbsNum;
    private double teaNum;
    private double alcoholsNum;

    ArrayList<Integer> drinksNum= new ArrayList<>();

    public Drinks(ArrayList<Integer> drinksNum) {
        this.drinksNum=drinksNum;
    }

    private double[] drinks = {soda, freshJuice, coffee, cocktails, tea, alcohols};
    public String[] drinksPrirnt = {"soda", "freshJuice", "coffee", "cocktails", "tea", "alcohols"};
    //private double[] num = {sodaNum, freshJuiceNum, coffeeNum, cocktailsNum, herbsNum, teaNum, alcoholsNum};

    public double TotalPriceDrinks() {
        double sum = 0;
        for (int i = 0; i < drinksNum.size(); i++) {
            if (drinksNum.get(i) > 0) {
                sum = sum + drinksNum.get(i) * drinks[i];
            }
        }
        return sum;
    }

    public double getSoda() {
        return soda;
    }

    public void setSoda(double soda) {
        this.soda = soda;
    }

    public double getFreshJuice() {
        return freshJuice;
    }

    public void setFreshJuice(double freshJuice) {
        this.freshJuice = freshJuice;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public double getCocktails() {
        return cocktails;
    }

    public void setCocktails(double cocktails) {
        this.cocktails = cocktails;
    }

    public double getHerbs() {
        return herbs;
    }

    public void setHerbs(double herbs) {
        this.herbs = herbs;
    }

    public double getTea() {
        return tea;
    }

    public void setTea(double tea) {
        this.tea = tea;
    }

    public double getAlcohols() {
        return alcohols;
    }

    public void setAlcohols(double alcohols) {
        this.alcohols = alcohols;
    }

    public double getSodaNum() {
        return sodaNum;
    }

    public void setSodaNum(double sodaNum) {
        this.sodaNum = sodaNum;
    }

    public double getFreshJuiceNum() {
        return freshJuiceNum;
    }

    public void setFreshJuiceNum(double freshJuiceNum) {
        this.freshJuiceNum = freshJuiceNum;
    }

    public double getCoffeeNum() {
        return coffeeNum;
    }

    public void setCoffeeNum(double coffeeNum) {
        this.coffeeNum = coffeeNum;
    }

    public double getCocktailsNum() {
        return cocktailsNum;
    }

    public void setCocktailsNum(double cocktailsNum) {
        this.cocktailsNum = cocktailsNum;
    }

    public double getHerbsNum() {
        return herbsNum;
    }

    public void setHerbsNum(double herbsNum) {
        this.herbsNum = herbsNum;
    }

    public double getTeaNum() {
        return teaNum;
    }

    public void setTeaNum(double teaNum) {
        this.teaNum = teaNum;
    }

    public double getAlcoholsNum() {
        return alcoholsNum;
    }

    public void setAlcoholsNum(double alcoholsNum) {
        this.alcoholsNum = alcoholsNum;
    }
}
