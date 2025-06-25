package com.xworkz.runner;

import com.xworkz.dto.FridgeDto;
import com.xworkz.repository.FridgeRepository;
import com.xworkz.repository.FridgeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class FridgeRunner {
    public static void main(String[] args) {
        FridgeRepository fridgeRepository = new FridgeRepositoryImpl();
        Collection<FridgeDto> fridgeDtos = fridgeRepository.findAll();

        System.out.println("Total size:" + fridgeDtos.size());

        for (FridgeDto fridgeDto : fridgeDtos) {
            if (fridgeDto.getCapacity() > 150) {
                System.out.println(fridgeDto.getBrand());
            }
        }
        System.out.println("================================");
        Iterator<FridgeDto> iterator = fridgeDtos.iterator();
        while (iterator.hasNext())
        {
            FridgeDto fridgeDto = iterator.next();
            System.out.println(fridgeDto);
        }
    }
}