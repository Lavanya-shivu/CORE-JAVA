package com.java.internal.Garage;

public class Garage {
    private String name = "SpeedFix Garage";
    private String location = "Downtown";
    private int totalCars = 15;
    private boolean isOpen = true;
    private double serviceCost = 1200.50;

    // Setters (package-private)
    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setTotalCars(int totalCars) {
        this.totalCars = totalCars;
    }

    void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    // Public Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalCars() {
        return totalCars;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public double getServiceCost() {
        return serviceCost;
    }
}
