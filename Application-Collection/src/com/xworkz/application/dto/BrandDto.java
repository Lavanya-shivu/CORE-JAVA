package com.xworkz.application.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@ToString
public class BrandDto {
    private String name;
    private String originCountry;
    private double averagePrice;
    private boolean gamingCapable;

    public BrandDto(String name,String originCountry,double averagePrice, boolean gamingCapable){

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,originCountry);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof BrandDto){
                BrandDto casted = (BrandDto) obj;
                return this.equals(casted.name) && this.originCountry == casted.originCountry;
            }
        }
        return  false;
    }
}
