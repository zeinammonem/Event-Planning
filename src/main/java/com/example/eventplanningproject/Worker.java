package com.example.eventplanningproject;

public class Worker extends Person{

    private String typeOfPlanner;
    private double minDeposit;
    private String locationOfWork;

    public Worker(String name, int age, String email, String address, int phoneNumber, String password, String typeOfPlanner, double minDeposit, String locationOfWork) {
        super(name, age, email, address, phoneNumber, password);
        this.typeOfPlanner = typeOfPlanner;
        this.minDeposit = minDeposit;
        this.locationOfWork = locationOfWork;
    }

    public String getTypeOfPlanner() {
        return typeOfPlanner;
    }

    public void setTypeOfPlanner(String typeOfPlanner) {
        this.typeOfPlanner = typeOfPlanner;
    }

    public double getMinDeposit() {
        return minDeposit;
    }

    public void setMinDeposit(double minDeposit) {
        this.minDeposit = minDeposit;
    }

    public String getLocationOfWork() {
        return locationOfWork;
    }

    public void setLocationOfWork(String locationOfWork) {
        this.locationOfWork = locationOfWork;
    }
}
