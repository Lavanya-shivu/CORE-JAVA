package com.java.internal;

public class Heater {
    private String brand;
    private int power;

    public Heater() {
    }

    public Heater(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void heat() {
        System.out.println("Heater is generating heat.");
    }
    @Override
    public String toString() {
        return "Heater [Brand: " + brand + ", Power: " + power + " watts]";
    }
}
