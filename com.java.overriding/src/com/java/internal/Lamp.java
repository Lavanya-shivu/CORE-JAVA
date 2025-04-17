package com.java.internal;

public class Lamp {
    private String lampType;
    private int brightnessLevel;

    public Lamp() {
    }

    public Lamp(String lampType, int brightnessLevel) {
        this.lampType = lampType;
        this.brightnessLevel = brightnessLevel;
    }

    public void setLampType(String lampType) {

        this.lampType = lampType;
    }

    public void setBrightnessLevel(int brightnessLevel) {

        this.brightnessLevel = brightnessLevel;
    }
    public void turnOn() {


        System.out.println("Turning on the lamp.");
    }
    @Override
    public String toString() {
        return "Lamp [Type: " + lampType + ", Brightness Level: " + brightnessLevel + "]";
    }
}
