package com.java.internal;

public class Gamepad {
    private String model;
    private int batteryLevel;

    public Gamepad() {
    }

    public Gamepad(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void connect() {
        System.out.println("Connecting the gamepad to the console.");
    }
    @Override
    public String toString() {
        return "Gamepad [Model: " + model + ", Battery Level: " + batteryLevel + "%]";
    }
}
