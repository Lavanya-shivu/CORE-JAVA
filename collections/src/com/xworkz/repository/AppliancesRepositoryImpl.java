package com.xworkz.repository;

import com.xworkz.dto.AppliancesDto;

import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRepositoryImpl implements AppliancesRepository{
    @Override
    public Collection<AppliancesDto> findAll() {

        AppliancesDto appliancesDto1 = new AppliancesDto("Refrigerator","Electricity","FoodStorage",12000,"Low");
        AppliancesDto appliancesDto2 = new AppliancesDto("WashingMachine","Electricity","WashingClothes",15000,"Low");
        AppliancesDto appliancesDto3 = new AppliancesDto("MicrowaveOven","Electricity","HeatingAndCookingFood",6000,"Medium");
        AppliancesDto appliancesDto4 = new AppliancesDto("MixerGrinder","Electricity","Grinding",3000,"High");
        AppliancesDto appliancesDto5 = new AppliancesDto("AirConditioner","Electricity","Cooling",4000,"Low");
        AppliancesDto appliancesDto6 = new AppliancesDto("Fan","Electricity","AirCirculation",2000,"Fixed");
        AppliancesDto appliancesDto7 = new AppliancesDto("InductionStove","Electricity","CookingFood",5000,"High");
        AppliancesDto appliancesDto8 = new AppliancesDto("VacuumCleaner","Battery","CleaningFloor",7000,"High");
        AppliancesDto appliancesDto9 = new AppliancesDto("WaterPurifier","Electricity","PurifyingDrinkingWater",3500,"Medium");
        AppliancesDto appliancesDto10 = new AppliancesDto("Gyser","Gas","HeatingWater",4000,"Low");

        Collection<AppliancesDto>collection = new ArrayList<>();
        collection.add(appliancesDto2);
        collection.add(appliancesDto3);
        collection.add(appliancesDto1);
        collection.add(appliancesDto4);
        collection.add(appliancesDto5);
        collection.add(appliancesDto6);
        collection.add(appliancesDto7);
        collection.add(appliancesDto8);
        collection.add(appliancesDto9);
        collection.add(appliancesDto10);

        return collection;
    }
}
