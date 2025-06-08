package com.xworkz.game.runner;

import com.xworkz.game.dto.GameDto;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService gameService = new GameServiceImpl();

        boolean running = true;

        while (running){
            System.out.println("Game Menu");
            System.out.println("1. Start Game");
            System.out.println("2.Load Game");
            System.out.println("3.Settings");
            System.out.println("4.Exit");
            System.out.println("Enter your choice between 1 to 5");

            try{
                int choice = scanner.nextInt();
                GameDto gameDto = new GameDto(choice);

                running = gameService.processChoice(gameDto);
            }catch (InputMismatchException e){
                System.out.println("Invalid input, Please enter a number between 1 to 5");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
