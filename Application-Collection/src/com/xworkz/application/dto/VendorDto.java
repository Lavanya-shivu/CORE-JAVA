package com.xworkz.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class VendorDto {
    private String name;
    private String gstNumber;
    private LocalDate establishedDate;

   public VendorDto(String name,String gstNumber, LocalDate establishedDate){

   }

    @Override
    public int hashCode() {
        return Objects.hash(name,gstNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof VendorDto){
                VendorDto casted = (VendorDto) obj;
                return this.equals(casted.name) && this.gstNumber == casted.gstNumber;
            }
        }
        return false;
    }
}
