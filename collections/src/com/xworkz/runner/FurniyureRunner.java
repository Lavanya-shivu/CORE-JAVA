package com.xworkz.runner;

import com.xworkz.dto.FurnitureDto;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

public class FurniyureRunner {
    public static void main(String[] args) {
        FurnitureDto furnitureDto1 = new FurnitureDto("Sofa","Leather",45000,"Medium");
        FurnitureDto furnitureDto2 = new FurnitureDto("DiningTable","Glass",20000,"Small");
        FurnitureDto furnitureDto3 = new FurnitureDto("Bed","Wood",40000,"Large");
        FurnitureDto furnitureDto4 = new FurnitureDto("Chair","Plastic",600,"Medium");
        FurnitureDto furnitureDto5 = new FurnitureDto("Wardrobe","Plywood",25000,"Medium");
        FurnitureDto furnitureDto6 = new FurnitureDto("Bookshelf","EngineeredWood",15000,"Medium");
        FurnitureDto furnitureDto7 = new FurnitureDto("CoffeeTable","Marbel",8000,"Small");
        FurnitureDto furnitureDto8 = new FurnitureDto("TVStand","Wood",12000,"Large");
        FurnitureDto furnitureDto9 = new FurnitureDto("OfficeDesk","Wood",9000,"Medium");
        FurnitureDto furnitureDto10 = new FurnitureDto("ReclinerChair","Leather",21000,"Large");

        Collection<FurnitureDto> collection = new ArrayList<>();
        collection.add(furnitureDto2);
        collection.add(furnitureDto3);
        collection.add(furnitureDto4);
        collection.add(furnitureDto5);
        collection.add(furnitureDto6);
        collection.add(furnitureDto7);
        collection.add(furnitureDto8);
        collection.add(furnitureDto9);
        collection.add(furnitureDto10);
        collection.add(furnitureDto1);

        for (FurnitureDto furnitureDto:collection)
        {
            System.out.println(furnitureDto.getType()+","+furnitureDto.getMaterial()+","+furnitureDto.getCost()+","+furnitureDto.getSize()+",");
        }
    }
}