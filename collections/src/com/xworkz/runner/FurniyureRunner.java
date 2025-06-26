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

        System.out.println("Is collection empty?" + furnitureDtos.isEmpty());

        FurnitureDto searchFurniture = new FurnitureDto("Sofa","Leather",45000,"Medium");
        System.out.println("Does collection contains sofa?" + furnitureDtos.contains(searchFurniture));

        boolean removed = furnitureDtos.remove(searchFurniture);
        System.out.println("Was sofa removed?" +removed);
        System.out.println("Size after remove:" + furnitureDtos.size());

        Collection<FurnitureDto> newFurnitureList = new ArrayList<>();
        newFurnitureList.add( new FurnitureDto("Pooja Mandir","Wood",12000,"Small"));

        System.out.println("Does furnitureDtos contains all from newFurnitureList?" + furnitureDtos.containsAll(newFurnitureList));

        boolean removedAll = furnitureDtos.containsAll(newFurnitureList);
        System.out.println("Were new furniture removed?" + removed);
        System.out.println("size after addAll:" + furnitureDtos.size());

        Collection<FurnitureDto> anotherList = furnitureRepository.findAll();
        System.out.println("Are furnitureDto and anotherList equal?" +furnitureDtos.equals(anotherList));


        System.out.println("========================================");
        Iterator<FurnitureDto> iterator = furnitureDtos.iterator();
        while (iterator.hasNext()) {
            FurnitureDto furnitureDto = iterator.next();
            System.out.println(furnitureDto);
        }
    }
    }