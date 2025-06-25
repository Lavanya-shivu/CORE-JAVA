package com.xworkz.runner;

import com.xworkz.dto.AppliancesDto;
import com.xworkz.repository.AppliancesRepository;
import com.xworkz.repository.AppliancesRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesRepository appliancesRepository = new AppliancesRepositoryImpl();
        Collection<AppliancesDto> appliancesDtos = appliancesRepository.findAll();

        System.out.println("Total size:" + appliancesDtos.size());

        System.out.println("Is collection empty?" + appliancesDtos.isEmpty());

        AppliancesDto searchAppliance = new AppliancesDto("Gyser","Gas","HeatingWater",4000,"Low");
        System.out.println("Does collection contains Gyser?" + appliancesDtos.contains(searchAppliance));

        boolean removed = appliancesDtos.remove(searchAppliance);
        System.out.println("Was Gyser removed?" + removed);
        System.out.println("Size after remove:" +appliancesDtos.size());

        Collection<AppliancesDto> newApplianceList = new ArrayList<>();
        newApplianceList.add(new AppliancesDto("Heater","Electricity","Heating Water",2000,"Low"));
        newApplianceList.add(new AppliancesDto("TV","Electricity","Time Pass",12000,"High"));

        boolean addedAll = appliancesDtos.addAll(newApplianceList);
        System.out.println("Were new appliance added?" +addedAll);
        System.out.println("Size after addAll:" +appliancesDtos.size());

        Collection<AppliancesDto> anotherList = appliancesRepository.findAll();
        System.out.println("Are applianceDtos and anotherList equal?" +appliancesDtos.equals(anotherList));

        System.out.println("=======================================");
        Iterator<AppliancesDto> iterator = appliancesDtos.iterator();
        while (iterator.hasNext()){
            AppliancesDto appliancesDto = iterator.next();
            System.out.println(appliancesDto);
        }
    }
}
