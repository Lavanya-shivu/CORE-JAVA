package com.java.internal;

public class Remote {
    private String brand;
    private int batteryLevel;

    public Remote(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed on the remote.");
    }
    @Override
    public String toString() {
        return "Remote [Brand: " + brand + ", Battery Level: " + batteryLevel + "%]";
    }
}
