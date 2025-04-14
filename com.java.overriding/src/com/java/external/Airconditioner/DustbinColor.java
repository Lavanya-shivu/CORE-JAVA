package com.java.external.Airconditioner;

import com.java.internal.Dustbin;

public class DustbinColor {
    public void colorDustbin(Dustbin dustbin) {
        if (dustbin != null) {
            dustbin.openLid();  // Call the openLid() method from the Dustbin class

            // Check if the dustbin is a SmartDustbin
            if (dustbin instanceof SmartDustbin) {
                SmartDustbin smartDustbin = (SmartDustbin) dustbin;  // Casting to SmartDustbin class
                smartDustbin.detectTrash();                           // Detect trash using motion sensor
                smartDustbin.compressWaste();                         // Compress the waste
            } else {
                System.err.println("This is not a smart dustbin.");
            }
        } else {
            System.err.println("No dustbin to handle.");
        }
    }

}
