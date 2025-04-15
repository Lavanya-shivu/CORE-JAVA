package com.java.external.Airconditioner;

import com.java.internal.Tunnel;

public class TollTunnel {
    public void tollTunnel(Tunnel tunnel){
        if(tunnel!= null){
            if(tunnel instanceof MountainTunnel){
                MountainTunnel mountainTunnel= (MountainTunnel) tunnel;
                mountainTunnel.exit();
                mountainTunnel.lightsOn();
            }
            else {
                tunnel.enter();
                System.out.println("Tunnel is TollTunnel");
            }
        }
        else {
            System.out.println("Tunnel is null");
        }
    }
}
