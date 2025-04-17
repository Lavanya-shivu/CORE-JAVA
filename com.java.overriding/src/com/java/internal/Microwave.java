package com.java.internal;

public class Microwave {
    private String brand;
    private int power;

    public Microwave() {
        this.brand = "Unknown";
        this.power = 800;
    }

    public Microwave(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setPower(int power) {

        this.power = power;
    }
    public void heat() {

        System.out.println("Heating food in the microwave.");
    }
    @Override
    public String toString() {
        return "Microwave [Brand: " + brand + ", Power: " + power + " watts]";
    }
}
