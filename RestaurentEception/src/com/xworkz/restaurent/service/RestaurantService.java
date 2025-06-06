package com.xworkz.restaurent.service;

import com.xworkz.restaurent.dto.RestaurantDto;
import com.xworkz.restaurent.exception.*;

public interface RestaurantService {
     boolean validateAndSave(RestaurantDto restaurantDto) throws InvalidNameException, InvalidRatingException, FoodMenuException, OpeningTimeException, ClosingTimeException, BookedDateException, BookedTimeException;

        }

