package com.java.external.Airconditioner;

import com.java.internal.Star;

public class GaintStar {
    public void gainStar(Star star){
        if(star!= null){
            if(star instanceof ShootingStar){
                ShootingStar shootingStar = (ShootingStar) star;
                shootingStar.disappear();
                shootingStar.moveFast();
            }
            else {
                star.shine();
                System.err.println("Star is GaintStar");
            }
        }
        else {
            System.err.println("Star is null");
        }
    }

}
