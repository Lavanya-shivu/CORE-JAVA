package com.java.internal;

public class Cartoon {
    private String title;
    private String genre;

    public Cartoon() {
    }

    public Cartoon(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void display() {
        System.out.println("Cartoon shows are full of fun and adventure!");
    }
    @Override
    public String toString() {
        return "Cartoon Title: " + title + ", Genre: " + genre;
    }
}
