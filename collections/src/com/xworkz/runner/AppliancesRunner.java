package com.xworkz.runner;

import com.xworkz.dto.AppliancesDto;
import com.xworkz.repository.AppliancesRepository;
import com.xworkz.repository.AppliancesRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesRepository appliancesRepository = new AppliancesRepositoryImpl();
        Collection<AppliancesDto> appliancesDtos = appliancesRepository.findAll();

        for(AppliancesDto appliancesDto: appliancesDtos){
            if(appliancesDto.getPrice()<5000){
                System.out.println(appliancesDto.getType());
            }
        }
        System.out.println("=======================================");
        Iterator<AppliancesDto> iterator = appliancesDtos.iterator();
        while (iterator.hasNext()){
            AppliancesDto appliancesDto = iterator.next();
            System.out.println(appliancesDto);
        }
    }
}
