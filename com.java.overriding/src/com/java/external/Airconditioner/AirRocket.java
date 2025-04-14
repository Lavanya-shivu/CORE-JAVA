package com.java.external.Airconditioner;

import com.java.internal.Rocket;

public class AirRocket {
    public void airRocket(Rocket rocket){
        if(rocket!= null){
            if(rocket instanceof SpaceRocket){
                SpaceRocket spaceRocket =(SpaceRocket) rocket;
                spaceRocket.igniteEngines();
                spaceRocket.orbit();
            }
            else {
                rocket.launch();
                System.err.println("This is AirRocket");
            }
        }
        else {
            System.err.println("Rocket is null");

        }
    }
}
