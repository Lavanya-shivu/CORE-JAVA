package com.java.internal;

public class Charger {
    private String type;
    private int capacity;

    public Charger() {
    }

    public Charger(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void supplyPower() {
        System.out.println("Charger is supplying power");
    }
    @Override
    public String toString() {
        return "Charger Type: " + type + ", Charger Capacity: " + capacity + "mAh";
    }
}
