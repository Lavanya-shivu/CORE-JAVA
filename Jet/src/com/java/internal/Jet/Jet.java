package com.java.internal.Jet;

public class Jet {
    private String model = "F-22 Raptor";
    private String manufacturer = "Lockheed Martin";
    private double maxSpeed = 2410; // km/h
    private int range = 2960; // km
    private boolean isMilitary = true;

    // Package-private setters
    void setModel(String model) {
        this.model = model;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setRange(int range) {
        this.range = range;
    }

    void setIsMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }

    // Public getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public boolean isMilitary() {
        return isMilitary;
    }
}
