package com.xworkz.restaurent.service;

import com.xworkz.restaurent.dto.RestaurantDto;
import com.xworkz.restaurent.exception.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public boolean validateAndSave(RestaurantDto restaurantDto) {
        boolean isValid = true;
        if (restaurantDto == null) {
            throw new NullPointerException("RestaurantDto is null");
        }try {
            String name = restaurantDto.getRestaurantName();
            if (name == null || name.isEmpty()) {
                throw new InvalidNameException("Name must not be null");
            }
        }catch (InvalidNameException e){
            System.out.println("Error Name:" +e.getMessage());
            }try {
            if (restaurantDto.getRestaurantName().length() < 3) {
                throw new InvalidNameException("Name must be at least 3 characters");
            }
        }catch(InvalidNameException e){
                System.out.println("Error Name:" +e.getMessage());
            }try{
            if (restaurantDto.getRestaurantName().length() > 25) {
                throw new InvalidNameException("Name must not exceed 25 characters");
            }
        }catch (InvalidNameException e){
            System.out.println("Error Name:" +e.getMessage());
        }try {
            if (Character.isDigit(restaurantDto.getRestaurantName().charAt(0))) {
                throw new InvalidNameException("Name must not starts with number");
            }
        }catch (InvalidNameException e){
            System.out.println("Error Name:" +e.getMessage());
        }try{
            if (Character.isDigit(restaurantDto.getRestaurantName().charAt(0))) {
                throw new InvalidNameException("Name must not starts with number");
            }
        }catch (InvalidNameException e){
            System.out.println("Name Error:" +e.getMessage());
        }
        try {
            if (restaurantDto.getRating() < 3) {
                throw new InvalidRatingException("Rating must be at greater than 3");
            }
        }catch (InvalidRatingException e){
            System.out.println("Error Rating:" +e.getMessage());
        }
       try {
           if (restaurantDto.getFoodMenu() == null) {
               throw new FoodMenuException("Food menu must not be null");
           }
       }catch (FoodMenuException e){
           System.out.println("Error FoodMenu:" +e.getMessage());
       }
        try {
            if (restaurantDto.getFoodMenu().length == 0) {
                throw new ArrayIndexOutOfBoundsException("Food menu is Empty");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error FoodMenu:" +e.getMessage());
        }
       try{
           if (restaurantDto.getOpeningTime().isBefore(LocalTime.of(9, 0))) {
               throw new OpeningTimeException("Opening Time must be After 9 AM");
           }
       }catch (OpeningTimeException e){
           System.out.println("Error Opening Time:" +e.getMessage());
       }
        try {
            if (restaurantDto.getClosingTime().isAfter(LocalTime.of(12, 0))) {
                throw new ClosingTimeException("Closing Time must be After 12 PM");
            }
        }catch (ClosingTimeException e){
            System.out.println("Error ClosingTime:" +e.getMessage());
        }
        try{
            if (restaurantDto.getBookedDate().isBefore(LocalDate.now())) {
                throw new BookedDateException("Booking date can not be in the past");
            }
        }catch (BookedDateException e){
            System.out.println("Error BookedTime:" +e.getMessage());
        }
        try{
            if (restaurantDto.getBookedTime().isBefore(LocalTime.of(9, 0)) || restaurantDto.getBookedTime().isAfter(LocalTime.of(12, 0))) {
                throw new BookedTimeException("Booking Time must be between the 9 AM to 12 PM");

            }
        }catch (BookedTimeException e){
            System.out.println("Error BookedTime:" +e.getMessage());
        }
return isValid;
    }
}