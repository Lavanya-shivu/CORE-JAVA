package com.java.external.Airconditioner;

import com.java.internal.Pencil;

public class ApsaraPencil {
    public void apsaraPencil(Pencil pencil){
        if(pencil!= null){
            if(pencil instanceof NatrajaPencil){
                NatrajaPencil natrajaPencil= (NatrajaPencil) pencil;
                natrajaPencil.click();
                natrajaPencil.hideTip();
            }
            else{
                pencil.draw();
                System.err.print("This is ApsaraPencil");
            }
        }
        else{
            System.err.println("Pencil is null");
        }
    }
}
