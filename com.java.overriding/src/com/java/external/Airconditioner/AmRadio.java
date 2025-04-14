package com.java.external.Airconditioner;

import com.java.internal.Radio;

public class AmRadio {
    public void amRadio(Radio radio){
        if(radio!= null){
            if(radio instanceof FmRadio){
                FmRadio fmRadio = (FmRadio) radio;
                fmRadio.adjustVolume();
                fmRadio.playStation();
            }
            else {
                radio.turnOn();
                System.err.println("This is AmRadio");
            }
        }
        else{
            System.err.println("Radio is null");
        }
    }
}
