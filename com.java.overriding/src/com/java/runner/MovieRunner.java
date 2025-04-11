package com.java.runner;

import com.java.external.Airconditioner.ActionMovie;

public class MovieRunner {
    public static void main(String[] args) {
        ActionMovie actionMovie = new ActionMovie();
        actionMovie.watch();                    // From Movie
        System.out.println("--------------------------");

        actionMovie.stunt();                    // Subclass method
        actionMovie.climax();                   // Subclass method
        actionMovie.climax(actionMovie);        // With object
        actionMovie.climax(null);               // With null
        System.out.println("==========================");
    }
}
