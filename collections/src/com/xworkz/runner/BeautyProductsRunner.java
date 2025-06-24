package com.xworkz.runner;

import com.xworkz.dto.BeautyProductsDto;

import java.util.ArrayList;
import java.util.Collection;

public class BeautyProductsRunner {
    public static void main(String[] args) {

        BeautyProductsDto beautyProductsDto1 = new BeautyProductsDto("LipBalm","Balm",198,"Pink","Normal");
        BeautyProductsDto beautyProductsDto2 = new BeautyProductsDto("Blush","Cream",103,"StrawberrySummer","Adult");
        BeautyProductsDto beautyProductsDto3 = new BeautyProductsDto("Sunscreen","Liquid",500,"Neutral","All");
        BeautyProductsDto beautyProductsDto4 = new BeautyProductsDto("Lipstick","Cream",500,"SpringCrimson","Normal");
        BeautyProductsDto beautyProductsDto5 = new BeautyProductsDto("Kajal","Pencil",350,"Black","All");
        BeautyProductsDto beautyProductsDto6 = new BeautyProductsDto("Mascara","Liquid",330,"Black","All");
        BeautyProductsDto beautyProductsDto7 = new BeautyProductsDto("Moisturizer","Gel",470,"Neutral","Adult");
        BeautyProductsDto beautyProductsDto8 = new BeautyProductsDto("Shampoo","Liquid",650,"White","All");
        BeautyProductsDto beautyProductsDto9 = new BeautyProductsDto("Serum","Drop",650,"Neutral","All");
        BeautyProductsDto beautyProductsDto10 = new BeautyProductsDto("NightCream","Gel",400,"White","All");

        Collection<BeautyProductsDto> collection = new ArrayList<>();
        collection.add(beautyProductsDto2);
        collection.add(beautyProductsDto3);
        collection.add(beautyProductsDto4);
        collection.add(beautyProductsDto5);
        collection.add(beautyProductsDto6);
        collection.add(beautyProductsDto7);
        collection.add(beautyProductsDto8);
        collection.add(beautyProductsDto9);
        collection.add(beautyProductsDto1);
        collection.add(beautyProductsDto10);

        for(BeautyProductsDto beautyProductsDto:collection){
            System.out.println(beautyProductsDto.getType()+","+beautyProductsDto.getForm()+","+beautyProductsDto.getPrice()+","+beautyProductsDto.getColor()+","+beautyProductsDto.getSkinType());
        }
    }
}
