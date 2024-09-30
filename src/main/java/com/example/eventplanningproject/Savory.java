package com.example.eventplanningproject;

import java.util.ArrayList;

public class Savory implements Food {

    private double sushi = 70;
    private double sandwiches = 40;
    private double friedChicken = 30;
    private double pasteries = 40;
    private double pasta = 60;
    private double salad = 45;
    private double rice = 50;
    private double fish = 100;
    private double grills = 100;
    private double pizza = 70;

    private double sushiNum;
    private double sandwichesNum;
    private double friedChickenNum;
    private double pasteriesNum;
    private double pastaNum;
    private double saladNum;
    private double riceNum;
    private double fishNum;
    private double grillsNum;
    private double pizzaNum;

    ArrayList<Integer> num = new ArrayList<>();

    public Savory(ArrayList<Integer> num) {
        this.num=num;
    }

    private double[] savory = {sushi, sandwiches, friedChicken, pasteries, pasta, salad, rice, fish, grills,pizza};
    //public double[] num = {sushiNum, sandwichesNum, friedChickenNum, pasteriesNum, pastaNum, saladNum, riceNum, fishNum, grillsNum,pizzaNum};
    public String [] SavoryPrint ={"sushi", "sandwiches", "friedChicken", "pasteries", "pasta", "salad", "rice", "fish", "grills","pizza"};

    @Override
    public double TotalPriceFood() {
        double sum = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > 0) {
                sum = sum + num.get(i) * savory[i];
            }
        }
        return sum;
    }

    public double getSushi() {
        return sushi;
    }

    public void setSushi(double sushi) {
        this.sushi = sushi;
    }

    public double getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(double sandwiches) {
        this.sandwiches = sandwiches;
    }

    public double getFriedChicken() {
        return friedChicken;
    }

    public void setFriedChicken(double friedChicken) {
        this.friedChicken = friedChicken;
    }

    public double getPasteries() {
        return pasteries;
    }

    public void setPasteries(double pasteries) {
        this.pasteries = pasteries;
    }

    public double getPasta() {
        return pasta;
    }

    public void setPasta(double pasta) {
        this.pasta = pasta;
    }

    public double getSalad() {
        return salad;
    }

    public void setSalad(double salad) {
        this.salad = salad;
    }

    public double getRice() {
        return rice;
    }

    public void setRice(double rice) {
        this.rice = rice;
    }

    public double getFish() {
        return fish;
    }

    public void setFish(double fish) {
        this.fish = fish;
    }

    public double getSushiNum() {
        return sushiNum;
    }

    public void setSushiNum(double sushiNum) {
        this.sushiNum = sushiNum;
    }

    public double getSandwichesNum() {
        return sandwichesNum;
    }

    public void setSandwichesNum(double sandwichesNum) {
        this.sandwichesNum = sandwichesNum;
    }

    public double getFriedChickenNum() {
        return friedChickenNum;
    }

    public void setFriedChickenNum(double friedChickenNum) {
        this.friedChickenNum = friedChickenNum;
    }

    public double getPasteriesNum() {
        return pasteriesNum;
    }

    public void setPasteriesNum(double pasteriesNum) {
        this.pasteriesNum = pasteriesNum;
    }

    public double getPastaNum() {
        return pastaNum;
    }

    public void setPastaNum(double pastaNum) {
        this.pastaNum = pastaNum;
    }

    public double getSaladNum() {
        return saladNum;
    }

    public void setSaladNum(double saladNum) {
        this.saladNum = saladNum;
    }

    public double getRiceNum() {
        return riceNum;
    }

    public void setRiceNum(double riceNum) {
        this.riceNum = riceNum;
    }

    public double getFishNum() {
        return fishNum;
    }

    public void setFishNum(double fishNum) {
        this.fishNum = fishNum;
    }

    public double getGrills() {
        return grills;
    }

    public void setGrills(double grills) {
        this.grills = grills;
    }

    public double getGrillsNum() {
        return grillsNum;
    }

    public void setGrillsNum(double grillsNum) {
        this.grillsNum = grillsNum;
    }
}
