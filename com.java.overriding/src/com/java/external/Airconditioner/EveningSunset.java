package com.java.external.Airconditioner;

import com.java.internal.Sunlight;

public class EveningSunset {
    public void eveningSunset(Sunlight sunlight){
        if(sunlight!= null){
            if(sunlight instanceof MorningSunlight){
                MorningSunlight morningSunlight = (MorningSunlight) sunlight;
                morningSunlight.fade();
                morningSunlight.warm();
            }
            else {
                sunlight.shine();
                System.err.println("Sunlight is morning light");
            }
        }
    }
}
