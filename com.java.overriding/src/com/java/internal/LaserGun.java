package com.java.internal;

public class LaserGun {
    private String gunType;
    private int energyLevel;

    public LaserGun() {
    }

    public LaserGun(String gunType, int energyLevel) {
        this.gunType = gunType;
        this.energyLevel = energyLevel;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public void shoot() {
        System.out.println("Firing laser beam...");
    }
    @Override
    public String toString() {
        return "LaserGun [Type: " + gunType + ", Energy Level: " + energyLevel + "]";
    }
}
