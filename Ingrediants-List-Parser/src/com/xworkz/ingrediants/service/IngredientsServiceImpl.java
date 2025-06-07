package com.xworkz.ingrediants.service;

import com.xworkz.ingrediants.dto.IngredientsDto;

public class IngredientsServiceImpl implements IngredientsService{
    @Override
    public void getIngredientsByIndex(IngredientsDto ingredientsDto, int index) {
        try{
            if(ingredientsDto == null || ingredientsDto.getIngredients() == null) {
                throw new NullPointerException("Ingredients list Must not be null");
            }
                String ingredients = ingredientsDto.getIngredients()[index];
                System.out.println("Ingredients index:" +ingredients +index);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Invalid index");
            }catch(NullPointerException e){
                System.out.println("Error:" + e.getMessage());
            }
    }
}
