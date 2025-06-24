package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BeautyProductsDto implements Serializable {
    private String type;
    private String form;
    private double price;
    private String color;
    private String skinType;

}
