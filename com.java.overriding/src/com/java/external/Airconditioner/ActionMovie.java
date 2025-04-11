package com.java.external.Airconditioner;

import com.java.internal.Movie;

public class ActionMovie extends Movie {
    public ActionMovie() {
        System.out.println("No-argument constructor in ActionMovie");
    }

    public void stunt() {
        System.out.println("Performing jaw-dropping stunts!");
    }

    public void climax() {
        System.out.println("Action-packed climax scene!");
    }

    public void climax(Movie movie) {
        if (movie != null) {
            System.out.println("Movie ends with an epic showdown.");
        } else {
            System.out.println("No movie to show the climax.");
        }
    }
}
