package com.xworkz.shopping.runner;

import com.xworkz.shopping.dto.ShoppingDto;
import com.xworkz.shopping.service.ShoppingService;
import com.xworkz.shopping.service.ShoppingServiceImpl;

import java.util.Scanner;

public class ShoppingRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingService shoppingService = new ShoppingServiceImpl();
        String[] shoppingItems = {"Banana", "Milk","Chocolate","IceCream"};
        ShoppingDto shoppingDto = new ShoppingDto(shoppingItems);
        System.out.println("Enter the index to fetch the items");
        int index = scanner.nextInt();

        shoppingService.fetchItemIndex(shoppingDto,index);
        scanner.close();

    }
}
