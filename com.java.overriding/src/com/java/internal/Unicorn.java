package com.java.internal;

public class Unicorn {
    private String name;
    private String color;

    public Unicorn(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void sparkle() {
        System.out.println("Unicorn sparkles with magic!");
    }
    @Override
    public String toString() {
        return "Unicorn [Name: " + name + ", Color: " + color + "]";
    }
}
