package com.example.eventplanningproject;

import java.time.DateTimeException;
import java.util.Date;

public class User extends Person {
    private Date date;

    public User(String name, int age, String email, String address, int phoneNumber, String password, Date date) {
        super(name, age, email, address, phoneNumber, password);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
