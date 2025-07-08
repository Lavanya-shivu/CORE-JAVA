package com.xworkz.runner;

import java.util.HashMap;
import java.util.Map;

public class CrudMapExample {
    public static void main(String[] args) {
        Map<Integer,String> dataMap = new HashMap<>();

        dataMap.put(1,"Lavanya");
        dataMap.put(2,"Krish");
        dataMap.put(3,"Venkat");

        System.out.println("Initial Map:");
        printMap(dataMap);

        System.out.println("Read element with key 2");
        String value = dataMap.get(2);
        System.out.println("Key 2 has value:"+value);

        System.out.println("Updating element with key 3");
        dataMap.put(3,"Sahana R");
        printMap(dataMap);

        System.out.println("Removing element with key 1");
        dataMap.remove(1);
        printMap(dataMap);
    }
    public static void printMap(Map<Integer,String>map){
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("Key:"+entry.getKey()+"->Value:"+entry.getValue());
        }
    }
}
