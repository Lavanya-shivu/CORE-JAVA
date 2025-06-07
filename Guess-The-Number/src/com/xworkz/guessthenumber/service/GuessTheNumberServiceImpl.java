package com.xworkz.guessthenumber.service;

import com.xworkz.guessthenumber.dto.GuessTheNumberDto;


public class GuessTheNumberServiceImpl implements GuessTheNumberService{

    @Override
    public boolean validated(GuessTheNumberDto guessTheNumberDto)  {
    try{
        if(guessTheNumberDto == null)
            throw new NullPointerException();
        int randomNumber = guessTheNumberDto.getRandomNumber();
        if(guessTheNumberDto.getNumberToGuess()<randomNumber)
        {
            System.out.println("You enterd the number range is low");
            return false;
        }
        if(guessTheNumberDto.getRandomNumber()>randomNumber){
            System.out.println("Your number is high");
            return false;
        }
        return true;
         }catch (NullPointerException e){
        System.out.println("GuessTheNumberDto is null");
    }
    return false;
    }
}
