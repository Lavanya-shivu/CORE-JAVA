package com.xworkz.node.dto;

import java.time.LocalDate;
import java.util.Objects;

public class PassportDto {
    private String passportNumber;
    private String holderName;
    private String nationality;
    private LocalDate dateOfExpiry;

    public PassportDto(String passportNumber,String holderName, String nationality, LocalDate dateOfExpiry){
        this.passportNumber = passportNumber;
        this.holderName = holderName;
        this.nationality = nationality;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber,holderName);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof PassportDto){
                PassportDto casted = (PassportDto) obj;
                return this.equals(casted.nationality) && this.dateOfExpiry == casted.dateOfExpiry;
            }
        }
        return false;
    }
}
