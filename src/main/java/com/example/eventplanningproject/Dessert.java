package com.example.eventplanningproject;

import java.util.ArrayList;

public class Dessert implements Food {

    private double cakes = 1000;
    private double cupcakes = 40;
    private double cheesecakes = 500;
    private double tarts = 500;
    private double cookies = 30;
    private double chocolates = 70;
    private double candies = 60;
    private double icecream = 40;

    private double cakesNum;
    private double cupcakesNum;
    private double cheesecakesNum;
    private double tartsNum;
    private double cookiesNum;
    private double chocolatesNum;
    private double candiesNum;
    private double icecreamNum;

    ArrayList<Integer> num = new ArrayList<>();

    private double[] dessert = {cakes, cupcakes, cheesecakes, tarts, cookies, chocolates, candies, icecream};
    public String[] dessertPrint = {"cakes", "cupcakes", "cheesecakes", "tarts", "cookies", "chocolates", "candies", "icecream"};
    //private double[] num = {cakesNum, cupcakesNum, cheesecakesNum, tartsNum, cookiesNum, chocolatesNum, candiesNum, icecreamNum};

    @Override
    public double TotalPriceFood() {
        double sum = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > 0) {
                sum = sum + num.get(i) * dessert[i];
            }
        }
        return sum;
    }

    public Dessert(ArrayList<Integer> num) {
        this.num=num;
    }

    public double getCakes() {
        return cakes;
    }

    public void setCakes(double cakes) {
        this.cakes = cakes;
    }

    public double getCupcakes() {
        return cupcakes;
    }

    public void setCupcakes(double cupcakes) {
        this.cupcakes = cupcakes;
    }

    public double getCheesecakes() {
        return cheesecakes;
    }

    public void setCheesecakes(double cheesecakes) {
        this.cheesecakes = cheesecakes;
    }

    public double getTarts() {
        return tarts;
    }

    public void setTarts(double tarts) {
        this.tarts = tarts;
    }

    public double getCookies() {
        return cookies;
    }

    public void setCookies(double cookies) {
        this.cookies = cookies;
    }

    public double getChocolates() {
        return chocolates;
    }

    public void setChocolates(double chocolates) {
        this.chocolates = chocolates;
    }

    public double getCandies() {
        return candies;
    }

    public void setCandies(double candies) {
        this.candies = candies;
    }

    public double getIcecream() {
        return icecream;
    }

    public void setIcecream(double icecream) {
        this.icecream = icecream;
    }

    public double getCakesNum() {
        return cakesNum;
    }

    public void setCakesNum(double cakesNum) {
        this.cakesNum = cakesNum;
    }

    public double getCupcakesNum() {
        return cupcakesNum;
    }

    public void setCupcakesNum(double cupcakesNum) {
        this.cupcakesNum = cupcakesNum;
    }

    public double getCheesecakesNum() {
        return cheesecakesNum;
    }

    public void setCheesecakesNum(double cheesecakesNum) {
        this.cheesecakesNum = cheesecakesNum;
    }

    public double getTartsNum() {
        return tartsNum;
    }

    public void setTartsNum(double tartsNum) {
        this.tartsNum = tartsNum;
    }

    public double getCookiesNum() {
        return cookiesNum;
    }

    public void setCookiesNum(double cookiesNum) {
        this.cookiesNum = cookiesNum;
    }

    public double getChocolatesNum() {
        return chocolatesNum;
    }

    public void setChocolatesNum(double chocolatesNum) {
        this.chocolatesNum = chocolatesNum;
    }

    public double getCandiesNum() {
        return candiesNum;
    }

    public void setCandiesNum(double candiesNum) {
        this.candiesNum = candiesNum;
    }

    public double getIcecreamNum() {
        return icecreamNum;
    }

    public void setIcecreamNum(double icecreamNum) {
        this.icecreamNum = icecreamNum;
    }
}
