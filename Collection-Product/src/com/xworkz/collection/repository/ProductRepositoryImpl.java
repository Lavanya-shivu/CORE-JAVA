package com.xworkz.collection.repository;

import com.xworkz.collection.dto.ProductDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Collection<ProductDto> findAll() {

        ProductDto productDto1 = new ProductDto(1,"iPhone15","SmartPhone", LocalDate.of(2024,5,15),"Apple",80000,5,10,1);
        ProductDto productDto2 = new ProductDto(2,"Samsung Galaxy S24","SmartPhone",LocalDate.of(2024,4,12),"Samsung",70000,7,10,1);
        ProductDto productDto3 = new ProductDto(3,"MacBook Air M2","Laptop",LocalDate.of(2024,3,10),"Apple",115000,10,5,2);
        ProductDto productDto4 = new ProductDto(4,"Dell XPS 13","Laptop",LocalDate.of(2023,11,15),"Dell",100000,15,5,3);
        ProductDto productDto5 = new ProductDto(5,"LG OLED TV","Television",LocalDate.of(2024,1,5),"LG",125000,15,2,1);
        ProductDto productDto6 = new ProductDto(6,"Sony Bravia 55","Television",LocalDate.of(2023,10,25),"Sonny",95000,18,4,3);
        ProductDto productDto7 = new ProductDto(7,"HP Pavilion","Laptop",LocalDate.of(23,12,30),"HP",69000,15,2,1);
        ProductDto productDto8 = new ProductDto(8,"Lenovo IdeaPad","Laptop",LocalDate.of(2024,2,18),"Lenova",59000,15,7,2);
        ProductDto productDto9 = new ProductDto(9,"Bajaj Air Cooler","Appliance",LocalDate.of(2023,3,20),"Bajaj",8000,2,9,2);
        ProductDto productDto10 = new ProductDto(10,"Havells Geyser","Appliance",LocalDate.of(2024,5,1),"Havells",9500,12,5,2);
        ProductDto productDto11 = new ProductDto(11,"Samsung Washing Machine","Appliance",LocalDate.of(2024,4,22),"Samsung",34000,7,5,2);
        ProductDto productDto12 = new ProductDto(12,"Whirlpool Fridge","Appliance",LocalDate.of(2023,8,12),"Whirlpool",35000,8,2,2);
        ProductDto productDto13 = new ProductDto(13,"Sony Bluetooth Speaker","Electronics",LocalDate.of(2023,7,2),"Sony",6000,7,6,1);
        ProductDto productDto14 = new ProductDto(14,"Canon Printer", "Office",LocalDate.of(2024,3,5),"Canon",8500,10,2,1);
        ProductDto productDto15 = new ProductDto(15,"Epson Scanner","Office",LocalDate.of(2023,12,3),"Epson",6500,9,5,1);
        ProductDto productDto16 = new ProductDto(16,"HP DeskJet Printer","Office",LocalDate.of(2024,1,12),"HP",5000,8,3,1);
        ProductDto productDto17 = new ProductDto(17,"TP-Link WiFi Route","Electronics",LocalDate.of(2024,5,15),"TP-Link",2400,19,5,1);
        ProductDto productDto18 = new ProductDto(18,"Realme Narzo 60","SmartPhone",LocalDate.of(2023,9,1),"Realme",15000,15,5,1);
        ProductDto productDto19 = new ProductDto(19,"Redmi Note 13", "Smartphone", LocalDate.of(2023, 11, 19), "Redmi", 17999, 10, 11, 1);
        ProductDto productDto20 = new ProductDto(20,"Oppo Reno 10", "Smartphone", LocalDate.of(2024, 6, 2), "Oppo", 29999, 9, 12, 1);
        ProductDto productDto21 = new ProductDto(21, "iPad Air", "Tablet", LocalDate.of(2024, 5, 10), "Apple", 54999, 7, 3, 1);
        ProductDto productDto22 = new ProductDto(22, "Samsung Galaxy Tab S9", "Tablet", LocalDate.of(2023, 9, 15), "Samsung", 47999, 10, 2, 1);
        ProductDto productDto23 = new ProductDto(23, "Dell Monitor 24", "Monitor", LocalDate.of(2024, 2, 18), "Dell", 12499, 10, 6, 2);
        ProductDto productDto24 = new ProductDto(24, "LG Monitor 27", "Monitor", LocalDate.of(2023, 7, 25), "LG", 14499, 12, 4, 2);
        ProductDto productDto25 = new ProductDto(25, "Philips Trimmer", "Personal Care", LocalDate.of(2024, 4, 5), "Philips", 1599, 5, 10, 1);
        ProductDto productDto26 = new ProductDto(26, "Boat Headphones", "Electronics", LocalDate.of(2023, 11, 12), "Boat", 2999, 6, 5, 1);
        ProductDto productDto27 = new ProductDto(27, "JBL Soundbar", "Electronics", LocalDate.of(2024, 1, 1), "JBL", 19999, 15, 3, 1);
        ProductDto productDto28= new ProductDto(28, "Ambrane Powerbank", "Electronics", LocalDate.of(2023, 8, 8), "Ambrane", 1299, 8, 2, 1);
        ProductDto productDto29 = new ProductDto(29, "Syska LED Bulb", "Electronics", LocalDate.of(2023, 10, 10), "Syska", 199, 5, 30, 1);
        ProductDto productDto30 = new ProductDto(30, "TCL 43","Television",  LocalDate.of(2024, 2, 10), "TCL", 31999, 10, 5, 2);
        ProductDto productDto31 = new ProductDto(31, "OnePlus 12", "Smartphone", LocalDate.of(2024, 4, 21), "OnePlus", 58999, 9, 8, 1);
        ProductDto productDto32 = new ProductDto(32, "IQOO Neo 9", "Smartphone", LocalDate.of(2023, 12, 18), "IQOO", 28999, 7, 6, 1);
        ProductDto productDto33 = new ProductDto(33, "Asus ROG Phone", "Smartphone", LocalDate.of(2024, 5, 5), "Asus", 69999, 11, 3, 1);
        ProductDto productDto34 = new ProductDto(34, "Mi Band 7", "Fitness", LocalDate.of(2023, 6, 14), "Xiaomi", 3499, 10, 15, 1);
        ProductDto productDto35= new ProductDto(35, "Noise Smartwatch", "Wearable", LocalDate.of(2024, 3, 7), "Noise", 5499, 8, 4, 1);
        ProductDto productDto36 = new ProductDto(36, "Fire-Boltt Ninja", "Wearable", LocalDate.of(2023, 11, 30), "Fire-Boltt", 1999, 6, 7, 1);
        ProductDto productDto37  = new ProductDto(37, "Samsung Microwave", "Appliance", LocalDate.of(2023, 9, 10), "Samsung", 11999, 10, 2, 2);
        ProductDto productDto38 = new ProductDto(38, "Prestige Mixer Grinder", "Kitchen", LocalDate.of(2024, 1, 15), "Prestige", 3499, 9, 5, 2);
        ProductDto productDto39 = new ProductDto(39, "Kent Water Purifier", "Appliance", LocalDate.of(2024, 2, 18), "Kent", 10499, 12, 6, 3);
        ProductDto productDto40 = new ProductDto(40, "Aquaguard RO", "Appliance", LocalDate.of(2023, 12, 28), "Eureka Forbes", 9499, 10, 4, 2);
        ProductDto productDto41 = new ProductDto(41, "Dell Inspiron", "Laptop", LocalDate.of(2024, 4, 4), "Dell", 78999, 14, 5, 2);
        ProductDto productDto42 = new ProductDto(42, "LG Dual Inverter AC", "Appliance", LocalDate.of(2024, 3, 2), "LG", 45999, 16, 2, 5);
        ProductDto productDto43 = new ProductDto(43, "Voltas Split AC", "Appliance", LocalDate.of(2023, 10, 9), "Voltas", 40999, 18, 3, 4);
        ProductDto productDto44 = new ProductDto(44, "Hitachi AC", "Appliance", LocalDate.of(2023, 8, 22), "Hitachi", 48999, 17, 2, 4);

Collection<ProductDto>collection = new ArrayList<>();
collection.add(productDto26);
collection.add(productDto1);
collection.add(productDto5);
collection.add(productDto2);
collection.add(productDto3);
collection.add(productDto4);
collection.add(productDto7);
collection.add(productDto6);
collection.add(productDto8);
collection.add(productDto9);
collection.add(productDto11);
collection.add(productDto10);
collection.add(productDto12);
collection.add(productDto13);
collection.add(productDto14);
collection.add(productDto15);
collection.add(productDto16);
collection.add(productDto17);
collection.add(productDto18);
collection.add(productDto19);
collection.add(productDto20);
collection.add(productDto21);
collection.add(productDto22);
collection.add(productDto23);
collection.add(productDto24);
collection.add(productDto25);
collection.add(productDto26);
collection.add(productDto27);
collection.add(productDto28);
collection.add(productDto29);
collection.add(productDto30);
collection.add(productDto31);
collection.add(productDto32);
collection.add(productDto33);
collection.add(productDto34);
collection.add(productDto35);
collection.add(productDto36);
collection.add(productDto37);
collection.add(productDto38);
collection.add(productDto39);
collection.add(productDto40);
collection.add(productDto41);
collection.add(productDto42);
collection.add(productDto43);
collection.add(productDto44);

return collection;
    }
}
