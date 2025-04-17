package com.java.internal;

public class Rainbow {
    private String color;
    private int duration;

    public Rainbow(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void appear() {
        System.out.println("Rainbow appears after rain.");
    }
    @Override
    public String toString() {
        return "Rainbow [Color: " + color + ", Duration: " + duration + " minutes]";
    }
}
