package com.xworkz.runner;

import com.xworkz.dto.BeautyProductsDto;
import com.xworkz.repository.BeautyProductsRepository;
import com.xworkz.repository.BeautyProductsRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BeautyProductsRunner {
    public static void main(String[] args) {

        BeautyProductsRepository beautyProductsRepository = new BeautyProductsRepositoryImpl();
        Collection<BeautyProductsDto> beautyProductsDtos = beautyProductsRepository.findAll();

        for(BeautyProductsDto beautyProductsDto : beautyProductsDtos){
            if(beautyProductsDto.getPrice()<300){
                System.out.println(beautyProductsDto.getForm());
            }
        }
        System.out.println("============================================");
        Iterator<BeautyProductsDto> iterator = beautyProductsDtos.iterator();
            while (iterator.hasNext()){
                BeautyProductsDto beautyProductsDto = iterator.next();
                System.out.println(beautyProductsDto);
            }


    }
}
