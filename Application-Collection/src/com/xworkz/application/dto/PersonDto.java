package com.xworkz.application.dto;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private String name;
    private String email;
    private String aadharNumber;

    @Override
    public int hashCode() {
        return Objects.hash(name,email);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof PersonDto){
                PersonDto casted = (PersonDto)  obj;
                return this.name.equals(casted.name) && this.aadharNumber == casted.aadharNumber;
            }
        }
        return false;
    }
}
