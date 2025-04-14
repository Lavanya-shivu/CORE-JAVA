package com.java.external.Airconditioner;

import com.java.internal.Barbie;
import com.java.internal.Metro;

public class ExpressMetro {
    public void expressMetro(Metro metro) {
        if (metro != null) {
            System.out.println("Metro is ready to start!");

            if (metro instanceof SmartMetro) {
                SmartMetro smartMetro = (SmartMetro) metro;
                smartMetro.schedule();
                smartMetro.destination();
            } else {
                metro.travel();
                System.err.println("This is a Express metro.");
            }
        } else {
            System.err.println("Mtro is null.");
        }
    }
}
