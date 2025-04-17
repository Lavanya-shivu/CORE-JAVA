package com.java.internal;

public class Lantern {
    private String lanternType;
    private int brightnessLevel;

    public Lantern() {
    }

    public Lantern(String lanternType, int brightnessLevel) {
        this.lanternType = lanternType;
        this.brightnessLevel = brightnessLevel;
    }

    public void setLanternType(String lanternType) {
        this.lanternType = lanternType;
    }

    public void setBrightnessLevel(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }
    public void glow() {
        System.out.println("Lantern is glowing with a warm light.");
    }
    @Override
    public String toString() {
        return "Lantern [Type: " + lanternType + ", Brightness Level: " + brightnessLevel + "]";
    }
}
