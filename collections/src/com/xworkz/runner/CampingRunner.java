package com.xworkz.runner;

import com.xworkz.dto.CampingDto;

import java.util.ArrayList;
import java.util.Collection;

public class CampingRunner {
    public static void main(String[] args) {
        CampingDto campingDto1 = new CampingDto("Medium",true,false,"Madikeri",true);
        CampingDto campingDto10= new CampingDto("Large",false,true,"Gokarna",false);
        CampingDto campingDto2 = new CampingDto("Small",true,false,"Chikkamanglore",true);
        CampingDto campingDto3 = new CampingDto("Medium",false,true,"SkandagiriHills",false);
        CampingDto campingDto4 = new CampingDto("Small",true,false,"Sakleshpur",true);
        CampingDto campingDto5 = new CampingDto("Large",false,true,"Shivanasamudra",true);
        CampingDto campingDto6 = new CampingDto("Small",true,false,"Dandeli",true);
        CampingDto campingDto7= new CampingDto("Medium",false,true,"Kabini",true);
        CampingDto campingDto8 = new CampingDto("Small",true,false,"Mullayanagiri",false);
        CampingDto campingDto9 = new CampingDto("Large",false,true,"Ramanagara",true);

        Collection<CampingDto>collection=new ArrayList<>();
        collection.add(campingDto1);
        collection.add(campingDto2);
        collection.add(campingDto3);
        collection.add(campingDto4);
        collection.add(campingDto5);
        collection.add(campingDto10);
        collection.add(campingDto6);
        collection.add(campingDto7);
        collection.add(campingDto8);
        collection.add(campingDto9);

        for(CampingDto campingDto:collection){
            System.out.println(campingDto.getTentSize()+","+campingDto.getIsStoveStainless()+","+campingDto.getIsFlashLightLongLasting()+","+campingDto.getPlace()+","+campingDto.getIsChairFoldable());
        }
    }
}
