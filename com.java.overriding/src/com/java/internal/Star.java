package com.java.internal;

public class Star {
    private String name;
    private int brightness;
    public Star(String name) {
        this.name = name;
    }

    public Star() {
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public void shine() {
        System.out.println("The star is shining brightly.");
    }
    @Override
    public String toString() {
        return "Star [Name: " + name + ", Brightness: " + brightness + "]";
    }
}
