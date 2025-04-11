package com.java.runner;

import com.java.external.Airconditioner.TvRemote;

public class RemoteRunner {
    public static void main(String[] args) {
        TvRemote tvRemote = new TvRemote();
        tvRemote.pressPowerButton();        // Base class method
        System.out.println("--------------------------");

        tvRemote.connectBluetooth();        // Subclass method
        tvRemote.turnOff();                 // Subclass method
        tvRemote.turnOff(tvRemote
        );      // With object
        tvRemote.turnOff(null);             // With null
        System.out.println("==========================");
    }
}
