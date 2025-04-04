package com.java.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Sunny Sunny = new Sunny(weather);
        Sunny.condition();
    }
}
