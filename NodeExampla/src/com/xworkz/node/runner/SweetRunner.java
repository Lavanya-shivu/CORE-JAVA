    package com.xworkz.node.runner;

    import com.xworkz.node.dto.SweetDto;

    import java.util.*;

    public class SweetRunner {

        public static void main(String[] args) {

            SweetDto sweetDto1 = new SweetDto("Champakali", 500, new String[]{"Maida", "Ghee", "Sugar", "Cardamom powder", "Water"}, 20, "Box");
            SweetDto sweetDto2 = new SweetDto("Gulab Jamun", 130, new String[]{"Milk Powder", "Ghee", "Sugar", "Cardamo", "Maida"}, 25, "Box");
            SweetDto sweetDto3 = new SweetDto("Rasgulla", 120, new String[]{"Milk", "Ghee", "Sugar", "Cardamom", "Lemon"}, 30, "Tin");
            SweetDto sweetDto4 = new SweetDto("Mysore Pak", 150, new String[]{"Gram Floor", "Ghee", "Sugar", "Cardamom", "Milk"}, 20, "Box");
            SweetDto sweetDto5 = new SweetDto("Kaju Katli", 250, new String[]{"Cashew", "Ghee", "Sugar", "Cardamom powder", "Silver Foil"}, 15, "Wrap");
            SweetDto sweetDto6 = new SweetDto("Ladoo", 100, new String[]{"Basen", "Ghee", "Sugar", "Cardamom powder", "Raisin"}, 50, "Pack");
            SweetDto sweetDto7 = new SweetDto("Jalebi", 80, new String[]{"Maida", "curd", "Sugar", "Cardamom powder", "Saffron"}, 35, "Box");
            SweetDto sweetDto8 = new SweetDto("Halwa", 90, new String[]{"Wheat", "Ghee", "Sugar", "Nuts", "Milk"}, 10, "Container");
            SweetDto sweetDto9 = new SweetDto("Barfi", 110, new String[]{"Milk", "Ghee", "Sugar", "Coconut", "Almond"}, 20, "Box");
            SweetDto sweetDto10 = new SweetDto("Peda", 160, new String[]{"Milk", "Ghee", "Sugar", "Cardamom", "Nuts"}, 18, "Wrap");
            SweetDto sweetDto11 = new SweetDto("Sandesh", 170, new String[]{"Paneer", "Ghee", "Sugar", "Saffron", "Rose"}, 22, "Box");
            SweetDto sweetDto12 = new SweetDto("Imarti", 95, new String[]{"Urad Dal", "Ghee", "Sugar", "Cardamom", "Saffron"}, 28, "PAck");
            SweetDto sweetDto13 = new SweetDto("Balushahi", 105, new String[]{"Maida", "Ghee", "Sugar", "Cardamom", "Curd"}, 16, "Box");
            SweetDto sweetDto14 = new SweetDto("Soan Papdi", 70, new String[]{"Maida", "Ghee", "Sugar", "Cardamom", "Gram Flour"}, 30, "Cube Pack");
            SweetDto sweetDto15 = new SweetDto("Cham cham", 150, new String[]{"Milk", "Paneer", "Sugar", "Saffron", "Rose"}, 20, "Box");
            SweetDto sweetDto16 = new SweetDto("Khoya Sweet", 180, new String[]{"Khoya", "Ghee", "Sugar", "Cardamom", "Almond"}, 24, "Tray");
            SweetDto sweetDto17 = new SweetDto("Rasmalai", 200, new String[]{"Milk", "Paneer", "Sugar", "Saffron", "Nuts"}, 12, "Bowl");
            SweetDto sweetDto18 = new SweetDto("Modak", 170, new String[]{"Rice Flour", "Jaggery", "Sugar", "Cardamom", "Coconut"}, 15, "Box");
            SweetDto sweetDto19 = new SweetDto("Palkova", 130, new String[]{"Maida", "Ghee", "Sugar", "Cardamom", "Nuts"}, 15, "Box");
            SweetDto sweetDto20 = new SweetDto("Kesari", 140, new String[]{"Rava", "Ghee", "Sugar", "Cardamom powder", "Saffron"}, 25, "Cup");
            SweetDto sweetDto21 = new SweetDto("Kozhukattai", 110, new String[]{"Rice", "Coconut", "Sugar", "Cardamom", "Jaggery"}, 20, "Wrap");
            SweetDto sweetDto22 = new SweetDto("Basundi", 190, new String[]{"Milk", "Sugar", "Cardamom", "Almond", "Pistachio"}, 10, "Jar");
            SweetDto sweetDto23 = new SweetDto("Milk Cake", 175, new String[]{"Milk", "Sugar", "Ghee", "Cardamom", "Nuts"}, 20, "Slab");
            SweetDto sweetDto24 = new SweetDto("Chocolate Barfi", 160, new String[]{"Cocoa", "Milk", "Sugar", "Ghee", "Cashew"}, 22, "Box");
            SweetDto sweetDto25 = new SweetDto("Fruit Halwa", 145, new String[]{"Fruit", "Sugar", "Ghee", "Nuts", "Cardamom"}, 30, "Pack");
            SweetDto sweetDto26 = new SweetDto("Fruit Halwa", 145, new String[]{"Fruit", "Sugar", "Ghee", "Nuts", "Cardamom"}, 30, "Pack");
            SweetDto sweetDto27 = new SweetDto("Honey Dew", 155, new String[]{"Honey", "Milk", "Cardamom", "Ghee", "Nuts"}, 16, "Cup");
            SweetDto sweetDto28 = new SweetDto("Mysurpa", 165, new String[]{"Ghee", "Sugar", "Besan", "Cardamom", "Milk"}, 20, "Wrap");
            SweetDto sweetDto29 = new SweetDto("Paneer Sweet", 180, new String[]{"Paneer", "Sugar", "Cardamom", "Rose", "Milk"}, 15, "Box");
            SweetDto sweetDto30 = new SweetDto("Dry Fruit Ladoo", 200, new String[]{"Cashew", "Almond", "Dates", "Raisin", "Ghee"}, 12, "Jar");

            Set<SweetDto> set = new HashSet<>();

            set.add(sweetDto4);
            set.add(sweetDto2);
            set.add(sweetDto5);
            set.add(sweetDto3);
            set.add(sweetDto6);
            set.add(sweetDto1);
            set.add(sweetDto7);
            set.add(sweetDto8);
            set.add(sweetDto9);
            set.add(sweetDto10);
            set.add(sweetDto11);
            set.add(sweetDto12);
            set.add(sweetDto13);
            set.add(sweetDto14);
            set.add(sweetDto15);
            set.add(sweetDto16);
            set.add(sweetDto17);
            set.add(sweetDto18);
            set.add(sweetDto19);
            set.add(sweetDto20);
            set.add(sweetDto21);
            set.add(sweetDto22);
            set.add(sweetDto23);
            set.add(sweetDto24);
            set.add(sweetDto25);
            set.add(sweetDto26);
            set.add(sweetDto27);
            set.add(sweetDto28);
            set.add(sweetDto29);
            set.add(sweetDto30);


            System.out.println("Total unique sweets:" + set.size());

            System.out.println("===========================================");
           Comparator<SweetDto> byPriceDesc = Comparator
                   .comparingDouble(SweetDto::getPrice)
                   .reversed()
                   .thenComparing(SweetDto::getName);

        Set<SweetDto> sortedSet = new TreeSet<>(byPriceDesc);
        sortedSet.addAll(set);

            System.out.println("Sweets sorted by desending price");
            for(SweetDto sweetDto : sortedSet){
            System.out.println(sweetDto.getName()+"-" + sweetDto.getPrice());

                System.out.println("=============================================");

                Comparator<SweetDto> byNameThenPriceDesc = Comparator
                        .comparing(SweetDto::getName)
                        .thenComparing(Comparator.comparingDouble(SweetDto::getPrice).reversed());

            Set<SweetDto> sortedByNameAndPrice = new TreeSet<>(byNameThenPriceDesc);
            sortedByNameAndPrice.addAll(set);

                System.out.println("Sweets sorted by name and price in desc");
                for (SweetDto sweetDtos : sortedByNameAndPrice) {
                    System.out.println(sweetDtos.getName() + "-" + sweetDto.getPrice());

                }
                    LinkedList<SweetDto> sweetList = new LinkedList<>(sortedByNameAndPrice);

                    System.out.println("===============================================");

                    System.out.println("Sweets in linked list");
                    for (SweetDto sweetDtos : sweetList){
                        System.out.println(sweetDtos.getName()+"-" +sweetDtos.getPrice());
                    }
                }
            }
        }

