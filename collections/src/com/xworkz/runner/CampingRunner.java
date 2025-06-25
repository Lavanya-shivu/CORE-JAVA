package com.xworkz.runner;

import com.xworkz.dto.CampingDto;
import com.xworkz.repository.CampingRepository;
import com.xworkz.repository.CampingRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CampingRunner {
    public static void main(String[] args) {

        CampingRepository campingRepository = new CampingRepositoryImpl();
        Collection<CampingDto> campingDtos = campingRepository.findAll();

        System.out.println("Total size:"+ campingDtos.size());

        System.out.println("Is collection Empty?" +campingDtos.isEmpty());

        CampingDto searchCamping = new CampingDto("Large",false,true,"Gokarna",false);
        System.out.println("Does collection contains Gokarna?" + campingDtos.contains(searchCamping));

        boolean removed = campingDtos.remove(searchCamping);
        System.out.println("Was samsung fridge removed?" +removed);
        System.out.println("Size after remove:" + campingDtos.size());

        Collection<CampingDto> newCampingList = new ArrayList<>();
        newCampingList.add(new CampingDto("Small" , true,true,"Shimoga",true));
        newCampingList.add(new CampingDto("Large",false,false,"Davangere",false));

        boolean addedAll = campingDtos.addAll(newCampingList);
        System.out.println("Were new camping place added?" + addedAll);
        System.out.println("Size after addAll:" + campingRepository.findAll().size());

        System.out.println("Does campingDto contains all from newCampingList?" + campingDtos.containsAll(newCampingList));

        boolean removedAll = campingDtos.removeAll(newCampingList);
        System.out.println("Were new fridges removed?" +removedAll);
        System.out.println("Size after addAll:"+campingDtos.size());

        Collection<CampingDto> anotherList = campingRepository.findAll();
        System.out.println("Are campingDto and anotherList equal?" +campingDtos.equals(anotherList));


            System.out.println("==================================");
            Iterator<CampingDto> iterator = campingDtos.iterator();
        while (iterator.hasNext())
        {
            CampingDto campingDto = iterator.next();
            System.out.println(campingDto);
        }
        }
    }

