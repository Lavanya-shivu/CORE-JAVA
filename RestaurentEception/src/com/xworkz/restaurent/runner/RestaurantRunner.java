package com.xworkz.restaurent.runner;

import com.xworkz.restaurent.dto.RestaurantDto;
import com.xworkz.restaurent.exception.*;
import com.xworkz.restaurent.service.RestaurantService;
import com.xworkz.restaurent.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) throws BookedDateException, InvalidNameException, ClosingTimeException, FoodMenuException, InvalidRatingException, BookedTimeException, OpeningTimeException {
        RestaurantDto restaurantDto = new RestaurantDto();
        restaurantDto.setRestaurantName("3Anmol");
        restaurantDto.setRestaurantLocation("Shimoga");
        restaurantDto.setContactDetails(854699138L);
        restaurantDto.setEmail("anmol@gmail.com");
        restaurantDto.setRating(4);
        restaurantDto.setFoodMenu(new String[]{"Biriyani, Starters, Beverges, Deserts"});
        restaurantDto.setType(false);
        restaurantDto.setOpeningTime(LocalTime.of(9,0));
        restaurantDto.setClosingTime(LocalTime.of(12,0));
        restaurantDto.setBookedDate(LocalDate.now());
        restaurantDto.setBookedTime(LocalTime.of(10,0));

        RestaurantService restaurantService = new RestaurantServiceImpl();
        boolean result = restaurantService.validateAndSave(restaurantDto);
    }
    }
