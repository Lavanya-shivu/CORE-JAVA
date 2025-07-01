package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);

        Collections.reverse(colors);

        System.out.println(colors);
    }
}
