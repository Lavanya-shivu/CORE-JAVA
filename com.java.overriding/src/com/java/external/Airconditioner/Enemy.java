package com.java.external.Airconditioner;

import com.java.internal.Player;
import com.java.internal.Pubg;

public class Enemy {
    public void enemy(Pubg pubg){
        if(pubg!= null){
            if(pubg instanceof Player){
                Player player = (Player) pubg;
                player.battle();
                player.enimies();
            }
            else {
                pubg.playing();
                System.err.println("This is Enemy");
            }
        }
        else {
            System.err.println("Pung is null");
        }
    }
}
