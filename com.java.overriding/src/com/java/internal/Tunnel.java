package com.java.internal;

public class Tunnel {
    private String location;
    private int length;

    public Tunnel(String location, int length) {
        this.location = location;
        this.length = length;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void enter() {
        System.out.println("Entering the tunnel...");
    }
    @Override
    public String toString() {
        return "Tunnel [Location: " + location + ", Length: " + length + " meters]";
    }
}
