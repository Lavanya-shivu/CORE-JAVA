package com.java.external.Airconditioner;
import com.java.internal.Galaxy;

public class SpiralGalaxie {
    public void spiralGalaxie(Galaxy galaxy) {
        if (galaxy != null) {
            if (galaxy instanceof MilkyWay) {
                MilkyWay milkyWay = (MilkyWay) galaxy;
                milkyWay.spiralArms();
                milkyWay.collapse();
            } else {
                galaxy.rotate();
                System.err.println("Galaxy is milkyway.");
            }
        } else {
            System.err.println("Galaxy is null");
        }
    }
}
