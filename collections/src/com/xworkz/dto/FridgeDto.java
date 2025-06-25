package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FridgeDto implements Serializable {
    private String brand;
    private String color;
    private String type;
    private double price;
    private int capacity;
}
