package com.xworkz.guest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Bangalore");

        System.out.println("ArrayList:" + cities);

        Set<String> citySet = new HashSet<>(cities);

        System.out.println("HashSet (unique & unordered):" + citySet);
    }
}
