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

        System.out.println("Total size:" + beautyProductsDtos.size());

        System.out.println("Is collection Empty?" + beautyProductsDtos.isEmpty());

        BeautyProductsDto searchBeauty = new BeautyProductsDto("LipBalm","Balm",198,"Pink","Normal");
        System.out.println("Does collection contains LipBalm?" + beautyProductsDtos.contains(searchBeauty));

        boolean removed = beautyProductsDtos.remove(searchBeauty);
        System.out.println("Was Lipbalm remove?" +removed);
        System.out.println("Size after remove:" + beautyProductsDtos.size());

        Collection<BeautyProductsDto> newBeutyList = new ArrayList<>();
        newBeutyList.add(new BeautyProductsDto("Foundation", "Liquid",800,"Cream","All"));
        newBeutyList.add(new BeautyProductsDto("Conciler","Liquid",520,"Brown","Sensitive"));

        boolean addedAll = beautyProductsDtos.addAll(newBeutyList);
        System.out.println("Were new beauty added?" + addedAll);
        System.out.println("Size after addAll:" +beautyProductsDtos.size());

        System.out.println("Does beautyProductsDto contains all from newBeautyList?" + beautyProductsDtos.containsAll(newBeutyList));

        boolean removedAll = beautyProductsDtos.removeAll(newBeutyList);
        System.out.println("Were new beautyProduct removed?" + removedAll);
        System.out.println("Size after addAll:" + beautyProductsDtos.size());

        Collection<BeautyProductsDto> anothetList = beautyProductsRepository.findAll();
        System.out.println("Are beautyProductsDtos and anotherList equal?" +beautyProductsDtos.equals(anothetList));

        System.out.println("============================================");
        Iterator<BeautyProductsDto> iterator = beautyProductsDtos.iterator();
            while (iterator.hasNext()){
                BeautyProductsDto beautyProductsDto = iterator.next();
                System.out.println(beautyProductsDto);
            }


    }
}
