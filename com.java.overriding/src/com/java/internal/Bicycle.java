package com.java.internal;

public class Bicycle {
    protected String type; // Type of bicycle (e.g., Mountain, Road)
    protected int gearCount; // Number of gears

    public Bicycle() {
        // default constructor
    }

    public Bicycle(String type, int gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
    public void ride() {
        System.out.println("Riding a basic bicycle.");
    }
    @Override
    public String toString() {
        return "Type: " + type + ", Gear Count: " + gearCount;
    }
}
