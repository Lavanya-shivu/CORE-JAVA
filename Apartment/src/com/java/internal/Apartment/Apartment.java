package com.java.internal.Apartment;

public class Apartment {
    private String name = "Skyline Heights";
    private String location = "Greenwood";
    private int numberOfFlats = 50;
    private boolean hasParking = true;
    private double maintenanceFee = 2500.00;

    // Setters (package-private)
    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfFlats(int numberOfFlats) {
        this.numberOfFlats = numberOfFlats;
    }

    void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    void setMaintenanceFee(double maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    // Public Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfFlats() {
        return numberOfFlats;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public double getMaintenanceFee() {
        return maintenanceFee;
    }
}
