package com.java.internal.Gym;

public class Gym {
    private String name = "FitZone";
    private String location = "City Center";
    private int members = 100;
    private boolean open24Hours = true;
    private double monthlyFee = 1500.00;

    // Setters (package-private)
    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setMembers(int members) {
        this.members = members;
    }

    void setOpen24Hours(boolean open24Hours) {
        this.open24Hours = open24Hours;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    // Getters (public)
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getMembers() {
        return members;
    }

    public boolean isOpen24Hours() {
        return open24Hours;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
