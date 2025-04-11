package com.java.runner;

import com.java.external.Airconditioner.FmRadio;

public class RadioRunner {
    public static void main(String[] args) {
        FmRadio radio = new FmRadio();
        radio.turnOn();
        System.out.println("--------------------------");

        radio.playStation();
        radio.adjustVolume();
        radio.adjustVolume(radio);
        radio.adjustVolume(null);
        System.out.println("==========================");
    }
}
