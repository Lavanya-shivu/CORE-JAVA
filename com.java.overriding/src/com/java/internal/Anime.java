package com.java.internal;

public class Anime {
    protected String title;
    protected int episodes;

    public Anime() {
        // default constructor
    }

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void watch() {
        System.out.println("Watching intense anime scenes!");
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Episodes: " + episodes;
        }
    }
