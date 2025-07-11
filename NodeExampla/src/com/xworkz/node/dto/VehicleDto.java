package com.xworkz.node.dto;

import java.util.Objects;

public class VehicleDto {
    private String registrationNumber;
    private String model;
    private String manufacturer;
    private int yearOfManufacture;

    public VehicleDto(String registrationNumber,String model,String manufacturer,int yearOfManufacture){
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber,model);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof VehicleDto){
                VehicleDto casted = (VehicleDto) obj;
                return this.equals(casted.manufacturer) && this.yearOfManufacture == casted.yearOfManufacture;
            }
        }
        return  false;
    }
}
