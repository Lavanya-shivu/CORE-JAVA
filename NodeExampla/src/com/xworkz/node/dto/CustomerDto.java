package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString

public class CustomerDto {
    private String name;
    private long contactNumber;
    private String email;
    private String address;

    public CustomerDto(String name,long contactNumber, String email, String address){
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,contactNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof CustomerDto){
                CustomerDto casted = (CustomerDto) obj;
                return this.equals(casted.name) && this.contactNumber == casted.contactNumber;
            }
        }
        return false;
    }
}
