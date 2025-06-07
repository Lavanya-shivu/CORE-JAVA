package com.xworkz.temperature.service;

public class TemperatureServiceImpl implements TemperatureService{
    @Override
    public int convertToDouble(String input) {
        String[] words = input.toLowerCase().split(" ");
        int total = 0;
        int current = 0;

        for (String word:words){
            int value = getWordValue(word);
            if(value==-1){
                System.out.println("Invalid word:" +word);
                return -1;
            }
            if(word.equals("hundred")){
                current *=100;
            }
            else {
                current += value;
            }
        }
        total += current;
        return total;
    }
    private  int getWordValue(String word){
    switch (word){
        case "zero": return 0;
        case "one" : return 1;
        case "two" : return 2;
        case "three" : return 3;
        case "four" : return 4;
        case "five": return 5;
        case "six" : return 6;
        case "seven" : return 7;
        case "eight" : return 8;
        case "nine" : return 9;
        case "ten": return 10;
        case "eleven" : return 11;
        case "twelve" : return 12;
        case "thirteen" : return 13;
        case "fourteen" : return 14;
        case "fifteen": return 15;
        case "sixteen" : return 16;
        case "seventeen" : return 17;
        case "eighteen" : return 18;
        case "nineteen" : return 19;
        case "twenty": return 20;
        case "thirty" : return 30;
        case "forty" : return 40;
        case "fifty" : return 50;
        case "sixty" : return 60;
        case "seventy": return 70;
        case "eighty" : return 80;
        case "ninety" : return 90;
        case "hundred" : return 100;
        default:return -1;
    }
    }
}
