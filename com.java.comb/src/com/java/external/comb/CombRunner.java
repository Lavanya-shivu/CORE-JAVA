package com.java.external.comb;

import com.java.internal.comb.Quality;

public class CombRunner {

    public static void main(String[] args){
        Quality quality=new Quality();
        quality.combQuality();
        System.out.println("Quality of the comb");

        Type type=new Type();
        type.combType();
        System.out.println("Type of the comb ");
    }
}
