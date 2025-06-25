package com.xworkz.runner;

import com.xworkz.dto.SareeDto;
import com.xworkz.repository.SareeRepository;
import com.xworkz.repository.SareeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {
        SareeRepository sareeRepository = new SareeRepositoryImpl();
        Collection<SareeDto> sareeDtos = sareeRepository.findAll();

        for(SareeDto sareeDto: sareeDtos){
            if(sareeDto.getPrice()<4000){
                System.out.println(sareeDto.getType());
            }
        }
        System.out.println("================================");
        Iterator<SareeDto> iterator = sareeDtos.iterator();
        while (iterator.hasNext())
        {
            SareeDto sareeDto = iterator.next();
            System.out.println(sareeDto);
        }

    }
}
