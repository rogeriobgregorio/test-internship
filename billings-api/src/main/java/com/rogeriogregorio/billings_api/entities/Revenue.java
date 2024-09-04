package com.rogeriogregorio.billings_api.entities;

public class Revenue {

    private int day;
    private double value;

    public Revenue(int day, double value) {
        this.day = day;
        this.value = value;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

