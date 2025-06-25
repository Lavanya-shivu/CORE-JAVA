package com.xworkz.repository;

import com.xworkz.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRepositoryImpl implements SareeRepository{
    @Override
    public Collection<SareeDto> findAll() {

        SareeDto sareeDto1 = new SareeDto("Wedding","Silk",250000,"Lavender");
        SareeDto sareeDto2 = new SareeDto("Graduation","Organza",2000,"SkyBlue");
        SareeDto sareeDto3 = new SareeDto("Office","Cotton",1500,"NavyBlue");
        SareeDto sareeDto4 = new SareeDto("Festival","Georgette",3000,"Peach");
        SareeDto sareeDto5 = new SareeDto("Housewarming","MysoreSilk",24000,"Cream");
        SareeDto sareeDto6 = new SareeDto("Reception","Neted",6000,"Pastel Green");
        SareeDto sareeDto7 = new SareeDto("Temple","Cotton",1200,"Red");
        SareeDto sareeDto8 = new SareeDto("Party","Chiffon",5000,"Black");
        SareeDto sareeDto9 = new SareeDto("Funeral","Cotton",500,"White");
        SareeDto sareeDto10 = new SareeDto("Photoshoot","Linen",4500,"Periwinkle");

        Collection<SareeDto> collection=new ArrayList<>();
        collection.add(sareeDto2);
        collection.add(sareeDto1);
        collection.add(sareeDto3);
        collection.add(sareeDto4);
        collection.add(sareeDto5);
        collection.add(sareeDto6);
        collection.add(sareeDto7);
        collection.add(sareeDto8);
        collection.add(sareeDto9);
        collection.add(sareeDto10);
        return collection;
    }
}
