package com.xworkz.runner;

import com.xworkz.dto.SareeDto;
import com.xworkz.repository.SareeRepository;
import com.xworkz.repository.SareeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {
        SareeRepository sareeRepository = new SareeRepositoryImpl();
        Collection<SareeDto> sareeDtos = sareeRepository.findAll();

        System.out.println("Total size:" +sareeDtos.size());

        System.out.println("Is collection empty?" + sareeDtos.isEmpty());

        SareeDto searchSaree = new SareeDto("Wedding","Silk",45000,"Lavender");
        System.out.println("Does collection contains weddind saree?" + sareeDtos.contains(searchSaree));

        boolean removed = sareeDtos.remove(searchSaree);
        System.out.println("Was wedding saree removed?"+removed);
        System.out.println("Size after remove:"+ sareeDtos.size());

        Collection<SareeDto> newSareeList = new ArrayList<>();
        newSareeList.add(new SareeDto("Haldi","Crepe",2500,"Yellow"));

        boolean addedAll = sareeDtos.addAll(newSareeList);
        System.out.println("Were new saree added?" + addedAll);
        System.out.println("Size after addAll:" +sareeDtos.size());

        System.out.println("Does sareeDto contains all from newSareeList?" +sareeDtos.containsAll(newSareeList));

        boolean removedAll = sareeDtos.removeAll(newSareeList);
        System.out.println("Were new saree removed?" + removedAll);
        System.out.println("Size after addAll:" +sareeDtos.size());

        Collection<SareeDto> anotherList = sareeRepository.findAll();
        System.out.println("Are sareeDto and Another equal?" +sareeDtos.equals(anotherList));


        System.out.println("================================");
        Iterator<SareeDto> iterator = sareeDtos.iterator();
        while (iterator.hasNext())
        {
            SareeDto sareeDto = iterator.next();
            System.out.println(sareeDto);
        }
        System.out.println("==============");
sareeDtos.stream()
        .sorted()
        .forEach(System.out::println);
    }
}
