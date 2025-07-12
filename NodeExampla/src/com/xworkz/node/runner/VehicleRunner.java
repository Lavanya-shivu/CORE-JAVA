package com.xworkz.node.runner;

import com.xworkz.node.dto.VehicleDto;

import java.util.*;

public class VehicleRunner {
    public static void main(String[] args) {
        List<VehicleDto> vehicleDtos = new ArrayList<>();

        VehicleDto vehicleDto1 = new VehicleDto("KA01AB1234", "Creta", "Hyundai", 2020);
       VehicleDto vehicleDto2 = new VehicleDto("MH12CD5678", "Swift", "Maruti", 2018);
        VehicleDto vehicleDto3 = new VehicleDto("TN09EF9101", "City", "Honda", 2019);
        VehicleDto vehicleDto4 = new VehicleDto("DL4CAF0001", "Fortuner", "Toyota", 2021);
        VehicleDto vehicleDto5 = new VehicleDto("KL07GH3344", "Venue", "Hyundai", 2022);
        VehicleDto vehicleDto6 = new VehicleDto("KA02XY1111", "Baleno", "Maruti", 2023);
        VehicleDto vehicleDto7 = new VehicleDto("MH03MN2222", "i20", "Hyundai", 2017);
        VehicleDto vehicleDto8 = new VehicleDto("AP10PQ3333", "XUV500", "Mahindra", 2019);
        VehicleDto vehicleDto9 = new VehicleDto("GJ01RS4444", "Altroz", "Tata", 2020);
        VehicleDto vehicleDto10 = new VehicleDto("RJ14TU5555", "Tiago", "Tata", 2021);
        VehicleDto vehicleDto11 = new VehicleDto("MP09VW6666", "Ciaz", "Maruti", 2018);
        VehicleDto vehicleDto12 = new VehicleDto("CH01XY7777", "Kushaq", "Skoda", 2022);
        VehicleDto vehicleDto13 = new VehicleDto("UP32AB8888", "Thar", "Mahindra", 2023);
        VehicleDto vehicleDto14 = new VehicleDto("OR05CD9999", "Glanza", "Toyota", 2021);
        VehicleDto vehicleDto15 = new VehicleDto("WB06EF0002", "Seltos", "Kia", 2020);
        VehicleDto vehicleDto16 = new VehicleDto("TS08GH1234", "Verna", "Hyundai", 2019);
        VehicleDto vehicleDto17 = new VehicleDto("TN10JK5678", "Scorpio", "Mahindra", 2017);
        VehicleDto vehicleDto18 = new VehicleDto("HR26LM9101", "Vento", "Volkswagen", 2018);
        VehicleDto vehicleDto19 =new VehicleDto("DL3CAB2345", "Ignis", "Maruti", 2021);
       VehicleDto vehicleDto20 = new VehicleDto("PB10ZX6789", "Jazz", "Honda", 2022);

        Set<VehicleDto> vehicleDto = new HashSet<>();

        vehicleDto.add(vehicleDto3);
        vehicleDto.add(vehicleDto1);
        vehicleDto.add(vehicleDto2);
        vehicleDto.add(vehicleDto4);
        vehicleDto.add(vehicleDto5);
        vehicleDto.add(vehicleDto6);
        vehicleDto.add(vehicleDto7);
        vehicleDto.add(vehicleDto8);
        vehicleDto.add(vehicleDto9);
        vehicleDto.add(vehicleDto10);
        vehicleDto.add(vehicleDto11);
        vehicleDto.add(vehicleDto12);
        vehicleDto.add(vehicleDto13);
        vehicleDto.add(vehicleDto14);
        vehicleDto.add(vehicleDto15);
        vehicleDto.add(vehicleDto16);
        vehicleDto.add(vehicleDto17);
        vehicleDto.add(vehicleDto18);
        vehicleDto.add(vehicleDto19);
        vehicleDto.add(vehicleDto20);

        vehicleDto.forEach(System.out::println);
    }
}
