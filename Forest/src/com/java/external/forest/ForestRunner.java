package com.java.external.forest;

import com.java.insertforest.Animals;

import javax.xml.stream.Location;

public class ForestRunner {
    public static void main(String[] args){
        Animals animals=new Animals();
        animals.kindofAnimals();
        System.out.println("total animals in forest");

        Birds birds=new Birds();
        birds.kindofBirds();
        System.out.println("total birds in forest");
    }
}
