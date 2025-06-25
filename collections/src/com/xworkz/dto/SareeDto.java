package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SareeDto implements Serializable {
    private String type;
    private String material;
    private double price;
    private String color;

}
