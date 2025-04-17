package com.java.internal;

public class Spaceship {
    private String name;
    private int speed;

    public Spaceship(String name) {
        this.name = name;
    }

    public Spaceship() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void launch() {
        System.out.println("Spaceship is launching into space.");
    }
    @Override
    public String toString() {
        return "Spaceship [Name: " + name + ", Speed: " + speed + " km/h]";
    }
}
