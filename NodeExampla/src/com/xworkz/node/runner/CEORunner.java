package com.xworkz.node.runner;

import com.xworkz.node.dto.CEODto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CEORunner {
    public static void main(String[] args) {
        List<CEODto> ceoDtos = new ArrayList<>();

        CEODto ceoDto1 = new CEODto("Sundar Pichai", 51, "Google", 8);
        CEODto ceoDto2 = new CEODto("Satya Nadella", 56, "Microsoft", 9);
        CEODto ceoDto3 = new CEODto("Tim Cook", 63, "Apple", 12);
        CEODto ceoDto4 = new CEODto("Andy Jassy", 56, "Amazon", 3);
        CEODto ceoDto5 = new CEODto("Mark Zuckerberg", 40, "Meta", 19);
        CEODto ceoDto6 = new CEODto("Elon Musk", 53, "Tesla", 15);
        CEODto ceoDto7 = new CEODto("Jensen Huang", 61, "NVIDIA", 31);
        CEODto ceoDto8 = new CEODto("Arvind Krishna", 62, "IBM", 4);
        CEODto ceoDto9 = new CEODto("Shantanu Narayen", 61, "Adobe", 17);
        CEODto ceoDto10 = new CEODto("Safra Catz", 62, "Oracle", 10);
        CEODto ceoDto11 = new CEODto("Gopal Vittal", 55, "Airtel", 10);
        CEODto ceoDto12 = new CEODto("Sanjiv Mehta", 60, "Hindustan Unilever", 9);
        CEODto ceoDto13 = new CEODto("Tobias Lütke", 43, "Shopify", 16);
        CEODto ceoDto14 = new CEODto("Reed Hastings", 63, "Netflix", 25);
        CEODto ceoDto15 = new CEODto("Raj Subramaniam", 56, "FedEx", 3);
        CEODto ceoDto16 = new CEODto("Jane Fraser", 56, "Citigroup", 3);
        CEODto ceoDto17 = new CEODto("Brian Chesky", 42, "Airbnb", 16);
        CEODto ceoDto18 = new CEODto("Lisa Su", 54, "AMD", 10);
        CEODto ceoDto19 = new CEODto("Chuck Robbins",58,"Cisco",8);
        CEODto ceoDto20 = new CEODto("Carol Tomé", 67, "UPS", 4);
        CEODto ceoDto21 = new CEODto("Mary Barra", 62, "General Motors", 10);
        CEODto ceoDto22 = new CEODto("Doug McMillon", 57, "Walmart", 10);
        CEODto ceoDto23 =  new CEODto("Daniel Zhang", 52, "Alibaba", 8);
        CEODto ceoDto24 = new CEODto("Dara Khosrowshahi", 55, "Uber", 7);
        CEODto ceoDto25= new CEODto("Leena Nair", 54, "Chanel", 2);

        Set<CEODto> ceoDto = new HashSet<>();

        ceoDto.add(ceoDto3);
        ceoDto.add(ceoDto1);
        ceoDto.add(ceoDto2);
        ceoDto.add(ceoDto4);
        ceoDto.add(ceoDto5);
        ceoDto.add(ceoDto6);
        ceoDto.add(ceoDto7);
        ceoDto.add(ceoDto8);
        ceoDto.add(ceoDto9);
        ceoDto.add(ceoDto10);
        ceoDto.add(ceoDto11);
        ceoDto.add(ceoDto12);
        ceoDto.add(ceoDto13);
        ceoDto.add(ceoDto14);
        ceoDto.add(ceoDto15);
        ceoDto.add(ceoDto16);
        ceoDto.add(ceoDto17);
        ceoDto.add(ceoDto18);
        ceoDto.add(ceoDto19);
        ceoDto.add(ceoDto20);
        ceoDto.add(ceoDto21);
        ceoDto.add(ceoDto22);
        ceoDto.add(ceoDto23);
        ceoDto.add(ceoDto24);
        ceoDto.add(ceoDto25);

        ceoDto.forEach(System.out::println);

    }
}
