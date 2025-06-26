package com.xworkz.runner;

import com.xworkz.dto.FridgeDto;
import com.xworkz.repository.FridgeRepository;
import com.xworkz.repository.FridgeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FridgeRunner {
    public static void main(String[] args) {
        FridgeRepository fridgeRepository = new FridgeRepositoryImpl();
        Collection<FridgeDto> fridgeDtos = fridgeRepository.findAll();

        System.out.println("Total size:" + fridgeDtos.size());

        System.out.println("Is Collection Empty?" + fridgeDtos.isEmpty());

        FridgeDto searchFridge = new FridgeDto("Samsung","Black","Double Door",35000,300);
        System.out.println("Does collection contains Samsung fridge?" + fridgeDtos.contains(searchFridge));

        boolean removed = fridgeDtos.remove(searchFridge);
        System.out.println("Was samsung fridge removed?"+removed);
        System.out.println("Size after remove:" + fridgeDtos.size());

        Collection<FridgeDto> newFridgeList = new ArrayList<>();
        newFridgeList.add(new FridgeDto("Panasonic","Silver","French Door",48000,450));
        newFridgeList.add(new FridgeDto("Godrej","White","Single Door",22000,190));

        boolean addedAll = fridgeDtos.addAll(newFridgeList);
        System.out.println("Were new fridge added?"+ addedAll);
        System.out.println("Size after addAll:"+fridgeDtos.size());

        System.out.println("Does fridgeDto contains all from newFridgeList?" +fridgeDtos.containsAll(newFridgeList));

        boolean removedAll = fridgeDtos.removeAll(newFridgeList);
        System.out.println("Were new fridges removed?" + removedAll);
        System.out.println("Size after addAll:"+fridgeDtos.size());

        Collection<FridgeDto> anotherList = fridgeRepository.findAll();
        System.out.println("Are fridgeDtos and anotherList equal?" +fridgeDtos.equals(anotherList));

        System.out.println("================================");
        Iterator<FridgeDto> iterator = fridgeDtos.iterator();
        while (iterator.hasNext())
        {
            FridgeDto fridgeDto = iterator.next();
            System.out.println(fridgeDto);
        }
    }
}