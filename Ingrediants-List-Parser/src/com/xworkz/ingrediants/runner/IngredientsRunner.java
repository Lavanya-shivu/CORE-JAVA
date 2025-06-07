package com.xworkz.ingrediants.runner;

import com.xworkz.ingrediants.dto.IngredientsDto;
import com.xworkz.ingrediants.service.IngredientsService;
import com.xworkz.ingrediants.service.IngredientsServiceImpl;

import java.util.Scanner;

public class IngredientsRunner {
    public static void main(String[] args) {
        String[] ingredients = {"Milk", "Water", "TeaPowder"};

        IngredientsDto ingredientsDto = new IngredientsDto(ingredients);
        IngredientsService ingredientsService = new IngredientsServiceImpl();

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the index of the ingredients to access");
            int index = scanner.nextInt();

            ingredientsService.getIngredientsByIndex(ingredientsDto,index);
        }
    }
}
