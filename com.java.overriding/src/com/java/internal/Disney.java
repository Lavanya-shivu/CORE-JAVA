package com.java.internal;

public class Disney {
    private String parkName;
    private String location;

    public Disney() {
    }

    public Disney(String parkName, String location) {
        this.parkName = parkName;
        this.location = location;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void show() {
        System.out.println("Welcome to the world of Disney!");
    }
    @Override
    public String toString() {
        return "Disney Park: " + parkName + ", Location: " + location;
    }
}
