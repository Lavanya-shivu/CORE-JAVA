package com.xworkz.collection.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@NoArgsConstructor

public class ProductDto implements Comparable<ProductDto>{
    int id;
    String name;
    String type;
    LocalDate manufactureDate;
    String manufacturer;
    double costPerItem;
    double discount;
    int quantity;
    int warranty;

    public ProductDto(int id,String name,String type,LocalDate manufactureDate,String manufacturer,double costPerItem,double discount,int quantity, int warranty){

        this.id = id;
        this.name = name;
        this.type = type;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.costPerItem = costPerItem;
        this.discount = discount;
        this.quantity = quantity;
        this.warranty = warranty;
    }

    @Override
    public int compareTo(ProductDto o) {
return 0;
    }
}
