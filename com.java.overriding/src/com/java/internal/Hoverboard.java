package com.java.internal;

public class Hoverboard {
    private String speed;
    private String color;

    // Default constructor
    public Hoverboard() {
    }
    public Hoverboard(String speed, String color) {
        this.speed = speed;
        this.color = color;
    }


    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void ride() {
        System.out.println("Riding the hoverboard...");
    }
    @Override
    public String toString() {
        return "Hoverboard [Speed: " + speed + ", Color: " + color + "]";
    }
}
