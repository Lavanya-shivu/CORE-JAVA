package com.java.external.Airconditioner;

import com.java.internal.Scooter;

public class FuelSccoter {
    public void fuelScooter(Scooter scooter){
        if(scooter!= null){
            if(scooter instanceof ElectricScooter){
                ElectricScooter electricScooter = (ElectricScooter) scooter;
                electricScooter.accelerate();
                electricScooter.charge();
            }
            else {
                scooter.ride();
                System.err.println("Scooter is FuelScooter");
            }
        }
        else {
            System.err.println("Scooter is null");
        }
    }
}
