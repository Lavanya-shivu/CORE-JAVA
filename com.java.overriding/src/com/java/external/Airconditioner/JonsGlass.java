package com.java.external.Airconditioner;

import com.java.internal.Sunglass;

public class JonsGlass {
    public void jonsGlass(Sunglass sunglass){
        if(sunglass!= null){
            if(sunglass instanceof Lenskart){
                Lenskart lenskart = (Lenskart) sunglass;
                lenskart.frameStyle();
                lenskart.remove();
            }
            else {
                sunglass.wear();
                System.err.println("Sunglass are from jonsGlass");
            }
        }
        else {
            System.err.println("Sunglass error");
        }
    }
}
