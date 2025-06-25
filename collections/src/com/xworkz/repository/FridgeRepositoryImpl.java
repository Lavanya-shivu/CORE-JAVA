package com.xworkz.repository;

import com.xworkz.dto.FridgeDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FridgeRepositoryImpl implements FridgeRepository {

    @Override
    public Collection<FridgeDto> findAll() {

        FridgeDto fridgeDto1 = new FridgeDto("Samsung", "Black", "Double Door", 35000, 300);
        FridgeDto fridgeDto3 = new FridgeDto("Whirlpool", "Meroon", "Top freezer", 28000, 100);
        FridgeDto fridgeDto4 = new FridgeDto("Haier", "Gray", "Bottom Freezer", 26000, 150);
        FridgeDto fridgeDto5 = new FridgeDto("Bosch", "Black", "Side by side Door", 42000, 400);
        FridgeDto fridgeDto2 = new FridgeDto("Lg", "Gray", "Single Door", 28000, 200);

        Collection<FridgeDto> collection = new ArrayList<>();
            collection.add(fridgeDto1);
            collection.add(fridgeDto2);
            collection.add(fridgeDto3);
            collection.add(fridgeDto4);
            collection.add(fridgeDto5);


        return collection;

        }
    }
