package com.greenfox.bankofsimba;

import java.text.DecimalFormat;

public class BankAccount {
    String name;
    double balance;
    String animalType;
    DecimalFormat formatter = new DecimalFormat("#.00");
    boolean isKing;


    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    @Override
    public String toString() {
        return (this.name + " " + formatter.format(this.balance) + " " + this.animalType);
    }

}
