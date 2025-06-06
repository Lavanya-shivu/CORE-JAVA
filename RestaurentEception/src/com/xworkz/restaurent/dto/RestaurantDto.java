package com.xworkz.restaurent.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class RestaurantDto {
    private String RestaurantName;
    private String RestaurantLocation;
    private long ContactDetails;
    private String Email;
    private int Rating;
    private String[] FoodMenu;
    private boolean type;
    private LocalTime OpeningTime;
    private LocalTime ClosingTime;
    private LocalDate BookedDate;
    private LocalTime BookedTime;
}
