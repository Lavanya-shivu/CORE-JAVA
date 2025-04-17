package com.java.internal;

public class Movie {
    private String name;
    private int duration;

    public Movie() {
        this.name = "Untitled";
        this.duration = 0;
    }

    public Movie(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void watch() {
        System.out.println("Watching a blockbuster movie!");
    }
    @Override
    public String toString() {
        return "Movie [Name: " + name + ", Duration: " + duration + " mins]";
    }
}
