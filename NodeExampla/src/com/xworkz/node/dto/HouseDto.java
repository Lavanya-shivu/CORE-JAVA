package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@ToString

public class HouseDto {
    private String address;
    private int numberOfRooms;
    private double areaInSqFeet;
    private boolean hasGarden;

    public HouseDto(String address, int numberOfRooms, double areaInSqFeet, boolean hasGarden){
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.areaInSqFeet = areaInSqFeet;
        this.hasGarden = hasGarden;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        HouseDto houseDto = (HouseDto) obj;
        return numberOfRooms == houseDto.numberOfRooms && Double.compare(areaInSqFeet, houseDto.areaInSqFeet) == 0 && hasGarden == houseDto.hasGarden && Objects.equals(address, houseDto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, numberOfRooms, areaInSqFeet, hasGarden);
    }
}
