package com.xworkz.node.dto;

import java.util.Objects;

public class CountryDto {
    private String name;
    private String capital;
    private long population;
    private String officialLanguage;

    public CountryDto(String name, String capital, long population, String officialLanguage){
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.officialLanguage = officialLanguage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,capital);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof CountryDto){
                CountryDto casted = (CountryDto) obj;
                return this.equals(casted.population) && this.officialLanguage == casted.officialLanguage;
            }
        }
        return false;
    }
}
