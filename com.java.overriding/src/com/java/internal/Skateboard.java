package com.java.internal;

public class Skateboard {
    private String brand;
    private int wheelCount;

    public Skateboard(String brand) {
        this.brand = brand;
    }

    public Skateboard() {
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    public void ride() {
        System.out.println("Riding a classic skateboard!");
    }
    @Override
    public String toString() {
        return "Skateboard [Brand: " + brand + ", Wheel Count: " + wheelCount + "]";
    }
}
