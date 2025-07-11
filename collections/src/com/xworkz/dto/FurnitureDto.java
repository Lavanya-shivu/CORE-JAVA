package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FurnitureDto implements Serializable {
    private String type;
    private String material;
    private double cost;
    private String size;

}
