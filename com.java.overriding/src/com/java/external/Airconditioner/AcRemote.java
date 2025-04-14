package com.java.external.Airconditioner;

import com.java.internal.Remote;

public class AcRemote {
    public void acRemote(Remote remote){
        if(remote!= null){
            if(remote instanceof TvRemote){
             TvRemote tvRemote = (TvRemote) remote;
             tvRemote.connectBluetooth();
             tvRemote.turnOff();
            }
            else {
                remote.pressPowerButton();
                System.err.println("Remote is AcRemote");
            }
        }
        else {
            System.err.println("Remote is null");
        }
    }
}
