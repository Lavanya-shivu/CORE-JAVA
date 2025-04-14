package com.java.external.Airconditioner;
import com.java.internal.Lamp;

public class BedLamp {
    public void bedLamp(Lamp lamp
    ) {
        if (lamp != null) {
            System.out.println("Lamp gives light");

            if (lamp instanceof TableLamp) {
                TableLamp tableLamp = (TableLamp) lamp;
                tableLamp.changeColor();
                tableLamp.turnOff();
            } else {
                lamp.turnOn();
                System.err.println("This is a tablelamp.");
            }
        } else {
            System.err.println("Lamp  is null.");
        }
    }
}
