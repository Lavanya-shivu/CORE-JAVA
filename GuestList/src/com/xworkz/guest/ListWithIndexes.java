package com.xworkz.guest;

import java.util.ArrayList;
import java.util.List;

public class ListWithIndexes {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java Script");
        languages.add("Html");

        System.out.println("List elements with index");

        for(int i=0; i< languages.size(); i++){
            System.out.println("Index" +i +":" + languages.get(i));
        }
    }
}
