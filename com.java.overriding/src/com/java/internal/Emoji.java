package com.java.internal;

public class Emoji {
    private String type;
    private String color;
    public Emoji() {
    }

    public Emoji(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {

        System.out.println("Displaying a basic emoji.");
    }
    @Override
    public String toString() {
        return "Emoji Type: " + type + ", Color: " + color;
    }
}
