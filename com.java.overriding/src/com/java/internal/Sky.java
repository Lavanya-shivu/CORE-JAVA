package com.java.internal;

public class Sky {
    private String color;
    private int cloudCount;

    public Sky(String color) {
        this.color = color;
    }

    public Sky() {
    }

    public void setCloudCount(int cloudCount) {
        this.cloudCount = cloudCount;
    }

    public void look() {
        System.out.println("Looking at the sky.");
    }
    @Override
    public String toString() {
        return "Sky [Color: " + color + ", Cloud Count: " + cloudCount + "]";
    }
}
