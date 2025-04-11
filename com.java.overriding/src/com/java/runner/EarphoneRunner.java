package com.java.runner;

import com.java.external.Airconditioner.WirelessEarphone;

public class EarphoneRunner {
    public static void main(String[] args) {
        WirelessEarphone earphone = new WirelessEarphone();
        earphone.playMusic();              // From base class
        System.out.println("--------------------------");

        earphone.connectBluetooth();       // Own method
        earphone.disconnect();             // Own method
        earphone.disconnect(earphone);     // With object
        earphone.disconnect(null);         // With null
        System.out.println("==========================");
    }
}
