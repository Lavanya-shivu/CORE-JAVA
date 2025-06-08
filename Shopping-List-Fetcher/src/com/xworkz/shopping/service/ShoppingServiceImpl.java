package com.xworkz.shopping.service;

import com.xworkz.shopping.dto.ShoppingDto;

public class ShoppingServiceImpl implements ShoppingService{
    @Override
    public void fetchItemIndex(ShoppingDto shoppingDto, int index) {
        try{
            String item = shoppingDto.getItems()[index];
            System.out.println("Item at index" + index+":"+item);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index:" + index+ "Provide a valid index");
        }
    }
}
