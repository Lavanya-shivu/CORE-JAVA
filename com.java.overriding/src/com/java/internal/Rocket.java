package com.java.internal;

public class Rocket {
    private String name;
    private int fuelLevel;

    public Rocket(String name, int fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void launch() {

        System.out.println("Launching the rocket into space.");
    }
    @Override
    public String toString() {
        return "Rocket [Name: " + name + ", Fuel Level: " + fuelLevel + "%]";
    }
}
