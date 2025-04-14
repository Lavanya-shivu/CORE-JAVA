package com.java.external.Airconditioner;

import com.java.internal.Rocket;
import com.java.internal.Spaceship;

public class TransportShip {
    public void transportShip(Spaceship spaceship){
        if(spaceship!= null){
            if(spaceship instanceof RocketSpaceship){
                RocketSpaceship rocketSpaceship = (RocketSpaceship) spaceship;
                rocketSpaceship.boost();
                rocketSpaceship.land();
            }
            else {
                spaceship.launch();
                System.err.println("SpaceShip is TransportShip");
            }
        }
        else {
            System.err.println("Spaceship is null");
        }
    }

}
