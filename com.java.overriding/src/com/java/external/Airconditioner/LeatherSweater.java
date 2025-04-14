package com.java.external.Airconditioner;

import com.java.internal.Sweater;

public class LeatherSweater {
    public void leatherSweater(Sweater sweater){
        if(sweater!= null){
            if(sweater instanceof WoolSweater){
                WoolSweater woolSweater = (WoolSweater) sweater;
                woolSweater.fabric();
                woolSweater.fold();
            }
            else {
                sweater.wear();
                System.err.println("Sweater is leaher");
            }
        }
        else {
            System.err.println("Sweater is null");
        }
    }
}
