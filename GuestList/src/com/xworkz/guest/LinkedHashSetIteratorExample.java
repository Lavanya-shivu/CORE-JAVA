package com.xworkz.guest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIteratorExample {
    public static void main(String[] args) {
        Set<String> animals = new LinkedHashSet<>();

        animals.add("Lion");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Panda");

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            String animal = iterator.next();
            System.out.println(animal);
        }

    }
}
