package com.java.external.beach;

import com.java.internal.beach.Shopping;

public class BeachRunner {
    public static void main(String[] args){
        Shopping shopping=new Shopping();
        shopping.beachShopping();

        System.out.println("shopping in the beach");

        Sunset sunset =new Sunset();
        sunset.beachSunset();
        System.out.println("Sunset in beach");
    }
}

