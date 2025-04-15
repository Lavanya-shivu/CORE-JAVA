package com.java.external.Airconditioner;

import com.java.internal.Tub;

public class WashTub {
    public void washTab(Tub tub){
        if(tub!= null){
            if(tub instanceof BathTub){
                BathTub bathTub = (BathTub) tub;
                bathTub.clean();
                bathTub.drain();
            }
            else{
                tub.fill();
                System.out.println("Tub is washTab");
            }
        }
        else {
            System.out.println("Tub is null");
        }
    }
}
