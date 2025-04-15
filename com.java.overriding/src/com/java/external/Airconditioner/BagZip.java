package com.java.external.Airconditioner;

import com.java.internal.Zip;

public class BagZip {
    public void bagZip(Zip zip){
        if(zip!=null){
            if(zip instanceof JacketZip){
                JacketZip jacketZip = (JacketZip) zip;
                jacketZip.lock();
                jacketZip.unzip();
            }
            else {
                zip.fasten();
                System.out.println("Zip is BagZip");
            }
        }
        else {
            System.out.println("Zip is null");
        }
    }
}
