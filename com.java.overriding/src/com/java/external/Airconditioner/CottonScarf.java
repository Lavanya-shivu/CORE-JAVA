package com.java.external.Airconditioner;

import com.java.internal.Scarf;

public class CottonScarf {
    public void cottonScarf(Scarf scarf){
        if(scarf!= null){
            if(scarf instanceof SilkScarf){
                SilkScarf silkScarf = (SilkScarf) scarf;
                silkScarf.fold();
                silkScarf.style();
            }
            else {
                scarf.wrap();
                System.err.println("Scarf is Cotton");
            }
        }
        else {
            System.err.println("Scarf is null");
        }
    }
}
