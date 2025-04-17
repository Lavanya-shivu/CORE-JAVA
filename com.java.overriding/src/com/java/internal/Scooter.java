package com.java.internal;

public class Scooter {
    private String type;
    private String color;

    public Scooter(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void ride() {
        System.out.println("Riding a manual scooter!");
    }
    @Override
    public String toString() {
        return "Scooter [Type: " + type + ", Color: " + color + "]";
    }
}
