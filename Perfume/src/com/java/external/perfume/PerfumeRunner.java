package com.java.external.perfume;

import com.java.internal.perfume.Brand;

public class PerfumeRunner {
    public static void main(String[] args){
        Brand brand=new Brand();
        brand.perfumeBrand();
        System.out.println("Brand of the perfume");

        Longlasting longlasting=new Longlasting();
        longlasting.perfumelonglasting();
        System.out.println("Longlasting perfume");
    }
}
