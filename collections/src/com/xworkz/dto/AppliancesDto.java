package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppliancesDto implements Serializable {
    private String type;
    private String powerSource;
    private String function;
    private double price;
    private String portability;
}
