package com.xworkz.node.runner;

import com.xworkz.node.dto.CompanyDto;

import java.util.*;

public class CompanyRunner {
    public static void main(String[] args) {
        List<CompanyDto> companyDtos = new ArrayList<>();

        CompanyDto companyDto1 = new CompanyDto("Amazon","E-Commerce","USA",1997);
        CompanyDto companyDto2 = new CompanyDto("Google","Technology","USA",1898);
        CompanyDto companyDto3 = new CompanyDto("Wipro","Service Based","India",1998);
        CompanyDto companyDto4 = new CompanyDto("Infosys","IT Based","India",1996);
        CompanyDto companyDto5 = new CompanyDto("Deloitte","Consulting","UK",1998);
        CompanyDto companyDto6 = new CompanyDto("Accenture"," Consulting","Ireland",1997);
        CompanyDto companyDto7 = new CompanyDto("Concentrix","Consulting","India",1997);
        CompanyDto companyDto8 = new CompanyDto("Congnizant","IT Based","USA",1997);
        CompanyDto companyDto9 = new CompanyDto("HCL","IT Based","India",1997);
        CompanyDto companyDto10 = new CompanyDto("Capgemini","Consulting","France",1997);
        CompanyDto companyDto11 = new CompanyDto("EY","Consulting","USA",1997);
        CompanyDto companyDto12 = new CompanyDto("Tata","Conglomerate","India",1997);
        CompanyDto companyDto13 = new CompanyDto("LG","Electronics","South Korea",1997);
        CompanyDto companyDto14 = new CompanyDto("IBM","Technology","USA",1997);
        CompanyDto companyDto15 = new CompanyDto("Alibaba","E-Commerce","China",1997);
        CompanyDto companyDto16 = new CompanyDto("Tencent","Gaming","China",1997);
        CompanyDto companyDto17 = new CompanyDto("KPMG","Consulting","Netherlands",1997);
        CompanyDto companyDto18 = new CompanyDto("Microsoft","Technology","USA",1997);
        CompanyDto companyDto19 = new CompanyDto("Intel","Semiconductors","USA",1997);
        CompanyDto companyDto20 = new CompanyDto("Oracle","Software","USA",1997);

        Set<CompanyDto> set = new HashSet<>();

        set.add(companyDto3);
        set.add(companyDto1);
        set.add(companyDto2);
        set.add(companyDto4);
        set.add(companyDto5);
        set.add(companyDto6);
        set.add(companyDto7);
        set.add(companyDto8);
        set.add(companyDto9);
        set.add(companyDto10);
        set.add(companyDto11);
        set.add(companyDto12);
        set.add(companyDto13);
        set.add(companyDto14);
        set.add(companyDto15);
        set.add(companyDto16);
        set.add(companyDto17);
        set.add(companyDto18);
        set.add(companyDto19);
        set.add(companyDto20);

        companyDtos.forEach(System.out::println);

        System.out.println("company sorted in desc");

        Set<CompanyDto> sortedSet = new TreeSet<>(set);
        sortedSet.stream().sorted(Comparator.comparing(CompanyDto::getName)).forEach(System.out::println);

        }
    }

