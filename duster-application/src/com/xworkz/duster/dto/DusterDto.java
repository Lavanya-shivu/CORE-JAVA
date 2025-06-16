package com.xworkz.duster.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DusterDto {
        String material;

        String color;

        int cost;

        LocalDate dateOfManufac;

        int quantity;

        String isUseful;

    }


