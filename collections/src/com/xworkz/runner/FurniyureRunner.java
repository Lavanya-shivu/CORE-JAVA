package com.xworkz.runner;

import com.xworkz.dto.FurnitureDto;
import com.xworkz.repository.FurnitureRepository;
import com.xworkz.repository.FurnitureRepositoryImpl;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FurniyureRunner {
    public static void main(String[] args) {

        FurnitureRepository furnitureRepository = new FurnitureRepositoryImpl();
        Collection<FurnitureDto> furnitureDtos = furnitureRepository.findAll();

        System.out.println("Total size:" + furnitureDtos.size());
        for (FurnitureDto furnitureDto : furnitureDtos) {
            if (furnitureDto.getCost() > 10000) {
                System.out.println(furnitureDto.getType());
            }
        }
        System.out.println("========================================");
        Iterator<FurnitureDto> iterator = furnitureDtos.iterator();
        while (iterator.hasNext()) {
            FurnitureDto furnitureDto = iterator.next();
            System.out.println(furnitureDto);
        }
    }
    }