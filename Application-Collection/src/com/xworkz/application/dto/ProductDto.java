package com.xworkz.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String type;
    private double price;
    private int modelNumber;
    private int id;

    @Override
    public int hashCode() {
        return Objects.hash(name,type);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if (obj instanceof ProductDto) {
                ProductDto casted = (ProductDto) obj;
                return this.equals( casted.name) && this.price == casted.price;
            }
        }
        return false;
    }

    public ProductDto(String name, String type, double price, int modelNumber, int id){


    }
}
