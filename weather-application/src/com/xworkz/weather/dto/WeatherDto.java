package com.xworkz.weather.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WeatherDto {
    private String placeName;
    private String weather;
    private String minTemp;
    private String maxTemp;
    private String cloudy;
    private String raining;
    private String rainInMM;
    private String humidity;
    private String windSpeed;
    private String sunRiseTime;
    private String sunSetTime;
    private String moonRiseTime;
    private String moonSetTime;
    private String rainStartTime;
    private String rainEndTime;
    private String precipitation;
    private LocalDateTime createdAt;
}
