package com.xworkz.duster.service;

import com.xworkz.duster.dto.DusterDto;
import com.xworkz.duster.repository.DusterRepo;
import com.xworkz.duster.repository.DusterRepoImpl;

import java.util.Optional;

public class DusterServiceImpl implements DusterService{
    @Override
    public boolean save(DusterDto dusterDto) {
        boolean valid = true;
        if(dusterDto == null){
            System.out.println("DustenDto running null");
            valid = false;
        }

        if (dusterDto.getMaterial() == null ) {
            System.out.println("Invalid material name");
            valid = false;
        }


        if (dusterDto.getColor() == null ) {
            System.out.println("Invalid color");
            valid = false;
        }


        if (dusterDto.getCost() > 150||dusterDto.getCost()==0) {
            System.out.println("Cost is too high or zero");
            valid = false;
        }

        if (dusterDto.getDateOfManufac()==null) {
            System.out.println("Invalid date of manufacture");
            valid = false;
        }


        if (dusterDto.getQuantity()==0 ) {
            System.out.println("Minimum one quantity");
            valid = false;
        }


        if (dusterDto.getIsUseful() == null ) {
            System.out.println("Invalid check ");
            valid = false;
        }


        System.out.println("data is valid, will save into DB using repo...");

        DusterRepo dusterRepo= new DusterRepoImpl();
        boolean repo = dusterRepo.persist(dusterDto);

        return valid;
        }
    @Override
    public Optional<DusterDto> findById(int id) {//>0
        System.out.println("running findById in dusterServiceImpl...");
        if(id>0)
        {
            System.out.println("id is valid :"+id);// call the repo
            DusterRepo dusterRepo=new DusterRepoImpl();
            return dusterRepo.findById(id);
        }

        return DusterService.super.findById(id);
    }
}
