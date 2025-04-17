package com.java.internal;

public class Robot {
    private String model;
    private int batteryLevel;

    public Robot(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    public void start() {
        System.out.println("Robot is starting up.");
    }
    @Override
    public String toString() {
        return "Robot [Model: " + model + ", Battery Level: " + batteryLevel + "%]";
    }
}
