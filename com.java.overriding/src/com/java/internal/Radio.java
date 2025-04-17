package com.java.internal;

public class Radio {
    private String brand;
    private int volume;

    public Radio(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void turnOn() {

        System.out.println("Turning on the radio.");
    }
    @Override
    public String toString() {
        return "Radio [Brand: " + brand + ", Volume: " + volume + "]";
    }
}
