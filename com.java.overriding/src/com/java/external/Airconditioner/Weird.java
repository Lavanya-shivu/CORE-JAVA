package com.java.external.Airconditioner;

import com.java.internal.Earphone;

public class Weird {
    public void weirdEarphone(Earphone earphone) {
        if (earphone != null) {
            earphone.playMusic();  // Call the playMusic() method from the Earphone class

            // Check if the earphone is a WirelessEarphone
            if (earphone instanceof WirelessEarphone) {
                WirelessEarphone wirelessEarphone = (WirelessEarphone) earphone;  // Casting to WirelessEarphone class
                wirelessEarphone.connectBluetooth();                               // Connect Bluetooth
                wirelessEarphone.disconnect();                                    // Disconnect earphone
            } else {
                System.err.println("This is not a wireless earphone.");
            }
        } else {
            System.err.println("No earphone to handle.");
        }
    }
}
