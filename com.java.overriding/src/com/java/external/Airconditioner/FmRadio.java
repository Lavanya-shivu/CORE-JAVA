package com.java.external.Airconditioner;

import com.java.internal.Radio;

public class FmRadio extends Radio {
    public FmRadio() {
        System.out.println("No-argument constructor in FmRadio");
    }

    public void playStation() {
        System.out.println("Playing FM station 91.1 MHz.");
    }

    public void adjustVolume() {
        System.out.println("Adjusting volume of the FM radio.");
    }

    public void adjustVolume(Radio radio) {
        if (radio != null) {
            System.out.println("Volume adjusted with control knob.");
        } else {
            System.out.println("No radio to adjust volume.");
        }
    }
}
