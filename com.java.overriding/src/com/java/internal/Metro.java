package com.java.internal;

public class Metro {
    private String line;
    private int passengers;

    public Metro() {
        this.line = "Unknown";
        this.passengers = 0;
    }

    public Metro(String line, int passengers) {
        this.line = line;
        this.passengers = passengers;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void travel() {
        System.out.println("Traveling by metro...");
    }
    @Override
    public String toString() {
        return "Metro [Line: " + line + ", Passengers: " + passengers + "]";
    }
}
