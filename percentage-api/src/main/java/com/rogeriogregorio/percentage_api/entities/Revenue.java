package com.rogeriogregorio.percentage_api.entities;

public class Revenue {
    private String state;
    private double amount;

    public Revenue(String state, double amount) {
        this.state = state;
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

