package com.xworkz.guessthenumber.runner;

import com.xworkz.guessthenumber.dto.GuessTheNumberDto;
import com.xworkz.guessthenumber.service.GuessTheNumberService;
import com.xworkz.guessthenumber.service.GuessTheNumberServiceImpl;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        GuessTheNumberDto guessTheNumberDto = new GuessTheNumberDto();
        guessTheNumberDto.setRandomNumber(randomNumber);

        try (Scanner scanner = new Scanner(System.in)) {
            GuessTheNumberService guessTheNumberService = new GuessTheNumberServiceImpl();
            boolean flag = true;
            while (flag) {

                System.out.println("Guess The Number");
                int guessTheNumber = scanner.nextInt();

                guessTheNumberDto.setNumberToGuess(guessTheNumber);

                if (guessTheNumberService.validated(guessTheNumberDto)) {
                    System.out.println("Your Guess is Correct");
                    flag = false;
                } else {
                    System.out.println("Wrong Number");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Give is not correct, Enter only numbers");
        } finally {
            System.out.println("Game Over");
        }
    }
}