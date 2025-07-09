package com.xworkz.application.dto;

import java.util.Objects;

public class CustomerDto {
    private int id;
    private String email;

    public CustomerDto(int id,String email){
        this.id = id;
        this.email=email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!= null){
            if(obj instanceof CustomerDto){
                CustomerDto casted = (CustomerDto) obj;
                return this.equals(casted.id) && this.email == casted.email;
            }
        }
        return false;
    }
}
