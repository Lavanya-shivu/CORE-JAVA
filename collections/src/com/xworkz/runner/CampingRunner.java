package com.xworkz.runner;

import com.xworkz.dto.CampingDto;
import com.xworkz.repository.CampingRepository;
import com.xworkz.repository.CampingRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class CampingRunner {
    public static void main(String[] args) {

        CampingRepository campingRepository = new CampingRepositoryImpl();
        Collection<CampingDto> campingDtos = campingRepository.findAll();

        System.out.println("Total size:"+ campingDtos.size());
        for(CampingDto campingDto:campingDtos){
            if(campingDto.isChairFoldable()==true){
                System.out.println(campingDto.getPlace());
            }
            System.out.println("==================================");
            Iterator<CampingDto> iterator = campingDtos.iterator();
        while (iterator.hasNext()){
            CampingDto campingDto1 = iterator.next();
            System.out.println(campingDto);
        }
        }
    }
}
