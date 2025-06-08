package com.xworkz.rating.service;

import com.xworkz.rating.dto.RatingDto;

public class RatingServiceImpl implements RatingService{
    @Override
    public boolean validate(RatingDto ratingDto) {
        if(ratingDto == null){
            System.out.println("Rating is null");
            return false;
        }
        int rating = ratingDto.getRating();
        if(rating >1 && rating <= 5){
            System.out.println("Thank you for your rating" +rating);
            return true;
        }
        else {
            System.out.println("Invalid rating, please enter a number between 1 to 5");
            return false;
        }
    }
}
