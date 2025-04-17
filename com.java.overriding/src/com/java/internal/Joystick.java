package com.java.internal;

public class Joystick {
    private String direction;
    private String sensitivity;

    public Joystick() {
    }

    public Joystick(String direction, String sensitivity) {
        this.direction = direction;
        this.sensitivity = sensitivity;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }
    public void move() {
        System.out.println("Moving the joystick.");
    }
    @Override
    public String toString() {
        return "Joystick [Direction: " + direction + ", Sensitivity: " + sensitivity + "]";
    }
}
