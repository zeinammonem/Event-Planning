package com.example.eventplanningproject;

import java.util.ArrayList;

public class Decorations {
    private double dj = 7000;
    private double lights = 3500;
    private double photographer = 2540;
    private double flowers = 3000;
    private double balloons = 3450;
    private double furniture = 6749;

    private boolean djCheck;
    private boolean lightsCheck;
    private boolean photographerCheck;
    private boolean flowersCheck;
    private boolean balloonsCheck;
    private boolean furnitureCheck;

    ArrayList<Boolean> bool = new ArrayList<>();

    //public boolean[] Check = {djCheck, lightsCheck, photographerCheck, flowersCheck, balloonsCheck, furnitureCheck};
    private double[] Decor = {dj, lights, photographer, flowers, balloons, furniture};
    public String[] DecorPrint = {"dj", "lights", "photographer", "flowers", "balloons", "furniture"};

    /*

    public Decorations(boolean djCheck, boolean lightsCheck, boolean photographerCheck, boolean flowersCheck, boolean balloonsCheck, boolean furnitureCheck) {
        this.djCheck = djCheck;
        this.lightsCheck = lightsCheck;
        this.photographerCheck = photographerCheck;
        this.flowersCheck = flowersCheck;
        this.balloonsCheck = balloonsCheck;
        this.furnitureCheck = furnitureCheck;
    }

     */

    public Decorations(ArrayList<Boolean> bool) {
        this.bool = bool;
    }

    public double TotalPriceDecor() {

        double sum = 0;

        for (int i = 0; i < bool.size(); i++) {
            if (bool.get(i) == true)
                sum += Decor[i];
        }

        return sum;

    }
}
