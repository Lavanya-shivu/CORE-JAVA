package com.xworkz.guest;

import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i= 1; i<= 10; i++){
            numbers.add(i);
        }
        System.out.println("Numbers from 1 to 10");
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
