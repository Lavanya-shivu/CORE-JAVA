package com.xworkz.game.service;

import com.xworkz.game.dto.GameDto;

public class GameServiceImpl implements GameService {
    @Override
    public boolean processChoice(GameDto gameDto) {
        if (gameDto == null) {
            System.out.println("GameDto is null");
            return false;
        }
        switch (gameDto.getChoice()) {
            case 1:
                System.out.println("Starting the game");
            case 2:
                System.out.println("Loading the Game");

        case 3:
            System.out.println("Opening Settings");

            case 4:
                System.out.println("Exiting Game");
                return false;
            default:
                System.out.println("Invalid option, please choose between 1 to 5");
    }
        return true;
}
}