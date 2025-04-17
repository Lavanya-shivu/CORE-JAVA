package com.java.internal;

public class Earphone {
    private String brand;
    private int batteryLife;

    public Earphone() {
    }

    public Earphone(String brand, int batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    public void playMusic() {
        System.out.println("Playing music through earphones.");
    }
    @Override
    public String toString() {
        return "Brand: " + brand + ", Battery Life: " + batteryLife + " hours";
    }
}
