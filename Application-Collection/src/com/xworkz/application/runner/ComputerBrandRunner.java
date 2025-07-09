package com.xworkz.application.runner;

import com.xworkz.application.dto.BrandDto;
import com.xworkz.application.dto.ComputerDto;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComputerBrandRunner {
    public static void main(String[] args) {


        ComputerDto computerDto1 = new ComputerDto(10,18900,"Windows 10 Home",1);
        ComputerDto computerDto2 = new ComputerDto(1,14999.00,"Windows 11 Pro",2);
        ComputerDto computerDto3 = new ComputerDto(8,9999,"Windows 8,1",1);
        ComputerDto computerDto4 = new ComputerDto(7,7999,"Windows 7 Ultimate",3);
        ComputerDto computerDto5 = new ComputerDto(11,17499.99,"Windows 11 Enterprise",1);
        ComputerDto computerDto6 = new ComputerDto(10,13499,"Windows 10 Pro",2);
        ComputerDto computerDto7 = new ComputerDto(11,14499.25,"Windows 11 Home",1);
        ComputerDto computerDto8 = new ComputerDto(10,12999,"Windows 10 Education",1);
        ComputerDto computerDto9 = new ComputerDto(8,9500.00,"Windows 8 Pro",2);
        ComputerDto computerDto10 = new ComputerDto(7,8699.00,"Windows 7 Basic",3);
        ComputerDto computerDto11 = new ComputerDto(11,15999.00,"Windows 11 Ultimate",1);
        ComputerDto computerDto12 = new ComputerDto(10,13999,"Windows 10 Enterprise",1);
        ComputerDto computerDto13 = new ComputerDto(9,10299.00,"Windows 9 Trial",2);
        ComputerDto computerDto14 = new ComputerDto(11,16999,"Windows 11 Education",1);
        ComputerDto computerDto15 = new ComputerDto(10,11500.00,"Windows 10 Starter",2);
        ComputerDto computerDto16 = new ComputerDto(9,9700.00,"Windows 8 Single Language",1);
        ComputerDto computerDto17 = new ComputerDto(11,8999.00,"Windows 7 Professional",3);
        ComputerDto computerDto18 = new ComputerDto(10,15555,"Windows 11 Developer",2);
        ComputerDto computerDto19 = new ComputerDto(9,12121.21,"Windows 10 Developer",1);
        ComputerDto computerDto20 = new ComputerDto(11,14900,"Windows 11 S Mode",1);
        ComputerDto computerDto21 = new ComputerDto(10,11000.00,"Windows 10 S",1);
        ComputerDto computerDto22 = new ComputerDto(8,9400.00,"Windows 8.1 Pro",2);
        ComputerDto computerDto23 = new ComputerDto(7,12700.00,"Windows 10 IOT",1);
        ComputerDto computerDto24 = new ComputerDto(11,16100.00,"Windows 11 IOT",1);
        ComputerDto computerDto25 = new ComputerDto(10,14500.00,"Windows 10 LTSC",3);

        BrandDto brandDto1 = new BrandDto("Dell","USA",58000,true);
        BrandDto brandDto2 = new BrandDto("HP","USA",52000,false);
        BrandDto brandDto3 = new BrandDto("Lenovo","China",49000,true);
        BrandDto brandDto4 = new BrandDto("Asus","Taiwan",61000,true);
        BrandDto brandDto5 = new BrandDto("Acer","Taiwan",41000,false);
        BrandDto brandDto6 = new BrandDto("MSI","Taiwan",82000.00,true);
        BrandDto brandDto7 = new BrandDto("Apple","USA",125000.00,false);
        BrandDto brandDto8 = new BrandDto("Samsung","South Korea",75000.00,true);
        BrandDto brandDto9 = new BrandDto("LG","South Korea",47000.00,false);
        BrandDto brandDto10 = new BrandDto("Sony","Japan",68000.00,false);
        BrandDto brandDto11 = new BrandDto("Toshiba","Japan",51000,false);
        BrandDto brandDto12 = new BrandDto("Microsoft Surface","USA",95000,true);
        BrandDto brandDto13 = new BrandDto("HCL","India",39000,false);
        BrandDto brandDto14 = new BrandDto("iBall","India",27000.00,false);
        BrandDto brandDto15 = new BrandDto("Razer","USA",140000.00,true);
        BrandDto brandDto16 = new BrandDto("Alienware","USA",180000,true);
        BrandDto brandDto17 = new BrandDto("Fujitsu","Japan",53000,false);
        BrandDto brandDto18 = new BrandDto("Panasonic","Japan",60000,false);
        BrandDto brandDto19 = new BrandDto("Gigabyte","Taiwan",70000,true);
        BrandDto brandDto20 = new BrandDto("Zebronics","India",32000,false);
        BrandDto brandDto21 = new BrandDto("Realme","China",40000,false);
        BrandDto brandDto22 = new BrandDto("Chuwi","China",35000,false);
        BrandDto brandDto23 = new BrandDto("Xiaomi","China",43000,false);
        BrandDto brandDto24 = new BrandDto("Origin PC","USA",160000,true);
        BrandDto brandDto25 = new BrandDto("Vaio","Japan",55000,false);

        Map<ComputerDto,BrandDto>map = new HashMap<>();

        map.put(computerDto3,brandDto3);
        map.put(computerDto1,brandDto1);
        map.put(computerDto2,brandDto2);
        map.put(computerDto4,brandDto4);
        map.put(computerDto5,brandDto5);
        map.put(computerDto6,brandDto6);
        map.put(computerDto7,brandDto7);
        map.put(computerDto8,brandDto8);
        map.put(computerDto9,brandDto9);
        map.put(computerDto10,brandDto10);
        map.put(computerDto11,brandDto11);
        map.put(computerDto12,brandDto12);
        map.put(computerDto13,brandDto13);
        map.put(computerDto14,brandDto14);
        map.put(computerDto15,brandDto15);
        map.put(computerDto16,brandDto16);
        map.put(computerDto17,brandDto17);
        map.put(computerDto18,brandDto18);
        map.put(computerDto19,brandDto19);
        map.put(computerDto20,brandDto20);
        map.put(computerDto21,brandDto21);
        map.put(computerDto22,brandDto22);
        map.put(computerDto23,brandDto23);
        map.put(computerDto24,brandDto24);
        map.put(computerDto25,brandDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);

        Set<Map.Entry<ComputerDto,BrandDto>> entrySet = map.entrySet();

        entrySet.forEach(entry->{
            ComputerDto computerDto = entry.getKey();

            BrandDto brandDto = entry.getValue();
            System.out.println("computer:"+computerDto+"brand:"+brandDto);
        });
    }
}
