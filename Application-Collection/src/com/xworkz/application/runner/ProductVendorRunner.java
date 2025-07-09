package com.xworkz.application.runner;

import com.xworkz.application.dto.ProductDto;
import com.xworkz.application.dto.VendorDto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductVendorRunner {
    public static void main(String[] args) {

        ProductDto productDto1 = new ProductDto("Samsung Galaxy S21", "Smartphone", 69999.99, 2101, 1);
        ProductDto productDto2 = new ProductDto("HP Pavilion x360", "Laptop", 55999.50, 3102, 2);
        ProductDto productDto3 = new ProductDto("Sony WH-1000XM4", "Headphones", 24999.00, 4103, 3);
        ProductDto productDto4 = new ProductDto("Canon EOS 1500D", "Camera", 38999.99, 5104, 4);
        ProductDto productDto5 = new ProductDto("iPad Air 5", "Tablet", 59999.00, 6105, 5);
        ProductDto productDto6 = new ProductDto("Boat Airdopes 141", "Earbuds", 1299.00, 7106, 6);
        ProductDto productDto7 = new ProductDto("LG 4K Smart TV", "Television", 84999.00, 8107, 7);
        ProductDto productDto8 = new ProductDto("Dell Inspiron 15", "Laptop", 47999.00, 3108, 8);
        ProductDto productDto9 = new ProductDto("Apple iPhone 14", "Smartphone", 79999.00, 2109, 9);
        ProductDto productDto10 = new ProductDto("Realme Watch 2", "Smartwatch", 2499.00, 9110, 10);
        ProductDto productDto11 = new ProductDto("Lenovo Tab M10", "Tablet", 12999.00, 6111, 11);
        ProductDto productDto12 = new ProductDto("JBL Flip 5", "Bluetooth Speaker", 8999.00, 1112, 12);
        ProductDto productDto13 = new ProductDto("Samsung Galaxy Buds2", "Earbuds", 9999.00, 7113, 13);
        ProductDto productDto14 = new ProductDto("Canon PIXMA G2020", "Printer", 11499.00, 1214, 14);
        ProductDto productDto15 = new ProductDto("Asus ROG Phone 6", "Smartphone", 72999.00, 2115, 15);
        ProductDto productDto16 = new ProductDto("Mi Smart Band 6", "Fitness Band", 2999.00, 9116, 16);
        ProductDto productDto17 = new ProductDto("Acer Aspire 7", "Laptop", 56999.00, 3117, 17);
        ProductDto productDto18 = new ProductDto("Fire-Boltt Ninja", "Smartwatch", 1999.00, 9118, 18);
        ProductDto productDto19 = new ProductDto("Sony Bravia X75K", "Television", 64999.00, 8119, 19);
        ProductDto productDto20 = new ProductDto("HP DeskJet 2332", "Printer", 4299.00, 1220, 20);
        ProductDto productDto21 = new ProductDto("Apple MacBook Air M2", "Laptop", 99999.00, 3121, 21);
        ProductDto productDto22 = new ProductDto("OnePlus Nord CE 3", "Smartphone", 25999.00, 2122, 22);
        ProductDto productDto23 = new ProductDto("OnePlus Nord CE 3", "Smartphone", 25999.00, 2122, 22);
        ProductDto productDto24 = new ProductDto("OnePlus Nord CE 3", "Smartphone", 25999.00, 2112, 22);
        ProductDto productDto25 = new ProductDto("OnePlus Nord CE 3", "Smartphone", 25999.00, 2122, 25);

        VendorDto vendorDto1 = new VendorDto("Tata Motors", "29ABCDE1234F1Z5", LocalDate.of(1945, 6, 1));
        VendorDto vendorDto2 = new VendorDto("Reliance Retail", "27AACCR1234H1Z9", LocalDate.of(2006, 8, 15));
        VendorDto vendorDto3 = new VendorDto("Infosys Ltd", "29AAACI1234L1ZV", LocalDate.of(1981, 2, 2));
        VendorDto vendorDto4 = new VendorDto("Wipro Technologies", "29AAACW1234H1ZM", LocalDate.of(1945, 12, 29));
        VendorDto vendorDto5 = new VendorDto("HCL Tech", "29AAACH1234R1ZJ", LocalDate.of(1976, 8, 11));
        VendorDto vendorDto6 = new VendorDto("Flipkart Pvt Ltd", "29AAACF1234E1ZO", LocalDate.of(2007, 10, 15));
        VendorDto vendorDto7 = new VendorDto("Zomato India", "29AAACZ1234K1Z3", LocalDate.of(2008, 7, 10));
        VendorDto vendorDto8 = new VendorDto("Swiggy Technologies", "29AAACS1234M1Z6", LocalDate.of(2014, 8, 1));
        VendorDto vendorDto9 = new VendorDto("Byju's", "29AABCB1234J1ZT", LocalDate.of(2011, 1, 25));
        VendorDto vendorDto10 = new VendorDto("PhonePe Pvt Ltd", "29AAACP1234Q1ZP", LocalDate.of(2015, 12, 15));
        VendorDto vendorDto11 = new VendorDto("Amazon India", "29AABCA1234R1Z9", LocalDate.of(2013, 6, 5));
        VendorDto vendorDto12 = new VendorDto("BigBasket", "29AACCB1234L1ZV", LocalDate.of(2011, 10, 10));
        VendorDto vendorDto13 = new VendorDto("TCS Ltd", "29AAACT1234F1ZB", LocalDate.of(1968, 4, 1));
        VendorDto vendorDto14 = new VendorDto("L&T Constructions", "29AAACL1234P1Z7", LocalDate.of(1938, 3, 23));
        VendorDto vendorDto15 = new VendorDto("Paytm Pvt Ltd", "29AAACP1234E1ZQ", LocalDate.of(2010, 11, 1));
        VendorDto vendorDto16 = new VendorDto("RedBus India", "29AABCR1234G1ZU", LocalDate.of(2006, 5, 15));
        VendorDto vendorDto17 = new VendorDto("Ola Cabs", "29AAACO1234N1ZV", LocalDate.of(2010, 12, 3));
        VendorDto vendorDto18 = new VendorDto("Snapdeal Pvt Ltd", "29AAACN1234W1ZZ", LocalDate.of(2010, 2, 15));
        VendorDto vendorDto19 = new VendorDto("MakeMyTrip", "29AABCM1234F1ZS", LocalDate.of(2000, 4, 1));
        VendorDto vendorDto20 = new VendorDto("MakeMyTrip", "29AABCM1234F1ZS", LocalDate.of(2000, 4, 1));
        VendorDto vendorDto21 = new VendorDto("UrbanClap", "29AAACU1234X1ZM", LocalDate.of(2014, 11, 10));
        VendorDto vendorDto22 = new VendorDto("Zoomcar India", "29AAACZ1234R1ZQ", LocalDate.of(2013, 4, 15));
        VendorDto vendorDto23 = new VendorDto("Zoomcar India", "29AAACZ1234R1ZQ", LocalDate.of(2013, 4, 15));
        VendorDto vendorDto24 = new VendorDto("Zoomcar India", "29AAACZ1234R1ZQ", LocalDate.of(2013, 3, 15));
        VendorDto vendorDto25 = new VendorDto("Zoomcar India", "29AAACZ1234R1ZQ", LocalDate.of(2013, 4, 25));

        Map<ProductDto,VendorDto>map = new HashMap<>();

        map.put(productDto1,vendorDto1);
        map.put(productDto2,vendorDto2);
        map.put(productDto3,vendorDto3);
        map.put(productDto4,vendorDto4);
        map.put(productDto5,vendorDto5);
        map.put(productDto6,vendorDto6);
        map.put(productDto7,vendorDto7);
        map.put(productDto8,vendorDto8);
        map.put(productDto9,vendorDto9);
        map.put(productDto10,vendorDto10);
        map.put(productDto11,vendorDto11);
        map.put(productDto12,vendorDto12);
        map.put(productDto13,vendorDto13);
        map.put(productDto14,vendorDto14);
        map.put(productDto15,vendorDto15);
        map.put(productDto16,vendorDto16);
        map.put(productDto17,vendorDto17);
        map.put(productDto18,vendorDto18);
        map.put(productDto19,vendorDto19);
        map.put(productDto20,vendorDto20);
        map.put(productDto21,vendorDto21);
        map.put(productDto22,vendorDto22);
        map.put(productDto23,vendorDto23);
        map.put(productDto24,vendorDto24);
        map.put(productDto25,vendorDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);

        Set<Map.Entry<ProductDto, VendorDto>> entrySet = map.entrySet();

        entrySet.forEach(entry->{
            ProductDto productDto = entry.getKey();

            VendorDto vendorDto = entry.getValue();
            System.out.println("product:" + productDto + "vendor:" +vendorDto);
        });
    }

}
