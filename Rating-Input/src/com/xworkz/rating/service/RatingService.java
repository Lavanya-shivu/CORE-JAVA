package com.xworkz.rating.service;

import com.xworkz.rating.dto.RatingDto;

public interface RatingService {
    boolean validate(RatingDto ratingDto);
}
