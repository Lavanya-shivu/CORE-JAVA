package com.xworkz.application.dto;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class AddressDto {
    private int number;
    private String street;
    private String city;
    private int pincode;

    public AddressDto(int number, String street, String city, int pincode) {
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, street);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof AddressDto){
                AddressDto casted= (AddressDto) obj;
                return this.street.equals(casted.street) && this.city == casted.city;
            }
        }
        return false;
    }
}
