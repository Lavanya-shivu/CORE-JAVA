package com.java.internal;

public class Traffic {
    private String signalColor;
    private String location;

    public Traffic(String signalColor) {
        this.signalColor = signalColor;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void signal() {
        System.out.println("Traffic signal is red.");
    }
    @Override
    public String toString() {
        return "Traffic Signal [Signal Color: " + signalColor + ", Location: " + location + "]";
    }
}
