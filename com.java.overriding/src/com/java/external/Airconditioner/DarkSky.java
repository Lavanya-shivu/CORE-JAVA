package com.java.external.Airconditioner;

import com.java.internal.Sky;

public class DarkSky {
    public void darkSky(Sky sky){
        if(sky!= null){
            if(sky instanceof BlueSky){
                BlueSky blueSky = (BlueSky) sky;
                blueSky.cloudType();
                blueSky.sunsetTime();
            }
            else {
                sky.look();
                System.err.println("Sky is dark");
            }
        }
        else {
            System.out.println("Sky is null");
        }
    }

}
