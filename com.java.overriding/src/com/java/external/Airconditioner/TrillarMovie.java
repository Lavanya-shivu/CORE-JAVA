package com.java.external.Airconditioner;

import com.java.internal.Movie;

public class TrillarMovie {
    public void trillarMovie(Movie movie){
        if(movie!= null){
            if(movie instanceof ActionMovie){
                ActionMovie actionMovie = (ActionMovie) movie;
                actionMovie.stunt();
                actionMovie.climax();
            }
            else {
                movie.watch();
                System.err.print("This is thrillar movie");
            }
        }else{
            System.err.print("Movie is null");
        }
    }
}
