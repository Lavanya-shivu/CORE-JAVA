package com.xworkz.node.dto;

import java.util.Objects;

public class DriverDto {
    private String name;
    private String licenseNumber;
    private int age;
    private int experienceYears;

    public DriverDto(String name,String licenseNumber,int age,int experienceYears){
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
        this.experienceYears = experienceYears;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,licenseNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if (obj instanceof DriverDto){
                DriverDto casted = (DriverDto) obj;
                return this.equals(casted.age) && this.experienceYears == casted.experienceYears;
            }
        }
        return false;
    }
}
