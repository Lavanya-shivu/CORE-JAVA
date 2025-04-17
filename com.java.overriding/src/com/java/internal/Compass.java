package com.java.internal;

public class Compass {
    private String direction;
    private String type;

    public Compass() {
    }

    public Compass(String direction, String type) {
        this.direction = direction;
        this.type = type;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showDirection() {
        System.out.println("Compass shows North direction.");
    }
    @Override
    public String toString() {
        return "Compass Type: " + type + ", Direction: " + direction;
    }
}
