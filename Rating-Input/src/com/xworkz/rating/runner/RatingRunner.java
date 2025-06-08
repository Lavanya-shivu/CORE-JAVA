package com.xworkz.rating.runner;

import com.xworkz.rating.dto.RatingDto;
import com.xworkz.rating.service.RatingService;
import com.xworkz.rating.service.RatingServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RatingService ratingService = new RatingServiceImpl();

        try{
            System.out.println("Enter the Rating");
            int inputRating = scanner.nextInt();

            RatingDto ratingDto = new RatingDto();
            ratingDto.setRating(inputRating);

            ratingService.validate(ratingDto);
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please enter a number between 1 to 5");
        }finally {
            System.out.println("Rating process completed");
            scanner.close();
        }
    }
}
