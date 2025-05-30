package com.java.internal;

public class Alien {
    private String planet;
    private
    int age;

    public Alien() {
        // default constructor
    }

    public Alien(String planet, int age) {
        this.planet = planet;
        this.age = age;
    }

    public void communicate() {
        System.out.println("Alien communicates in mysterious ways.");
    }

    @Override
    public String toString() {
        return "Planet: " + planet + ", Age: " + age;
    }
}
