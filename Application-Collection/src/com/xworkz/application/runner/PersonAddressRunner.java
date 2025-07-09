package com.xworkz.application.runner;

import com.xworkz.application.dto.AddressDto;
import com.xworkz.application.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonAddressRunner {
    public static void main(String[] args) {
        PersonDto personDto1 = new PersonDto("Lavanya","lavanya@gmail.com","230152469645");
        PersonDto personDto2 = new PersonDto("Krish","krish02@gmail.com","230152469654");
        PersonDto personDto3 = new PersonDto("Venkat","venkat15@gmail.com","230152469612");
        PersonDto personDto4 = new PersonDto("Manasa","manasa@gmail.com","230152469645");
        PersonDto personDto5 = new PersonDto("Medha","medh@gmail.com","230152469645");
        PersonDto personDto6 = new PersonDto("Lavanya","lavanya@gmail.com","230152469645");
        PersonDto personDto7 = new PersonDto("Krish","krish02@gmail.com","230152469654");
        PersonDto personDto8 = new PersonDto("Venkat","venkat15@gmail.com","230152469612");
        PersonDto personDto9 = new PersonDto("Manasa","manasa@gmail.com","230152469645");
        PersonDto personDto10 = new PersonDto("Medha","medh@gmail.com","230152469645");
        PersonDto personDto11 = new PersonDto("Nagashree","nagashree@gmail.com","230152469622");
        PersonDto personDto12 = new PersonDto("Sneha","sneha11@gmail.com","230152469611");
        PersonDto personDto13 = new PersonDto("Chaithra","chaithra@gmail.com","230152469600");
        PersonDto personDto14 = new PersonDto("Monisha","monisha@gmail.com","230100469633");
        PersonDto personDto15 = new PersonDto("Bindu","bindu01@gmail.com","230152469645");
        PersonDto personDto16 = new PersonDto("Dileep","dileep@gmail.com","230152449645");
        PersonDto personDto17 = new PersonDto("Shivu","shivu02@gmail.com","230152499654");
        PersonDto personDto18 = new PersonDto("Durga","durga15@gmail.com","230152469612");
        PersonDto personDto19 = new PersonDto("Mani","mani000@gmail.com","230112469645");
        PersonDto personDto20 = new PersonDto("Prajwal","prajwal@gmail.com","220152469645");
        PersonDto personDto21 = new PersonDto("Abu","abu420@gmail.com","230154469645");
        PersonDto personDto22 = new PersonDto("Chirag","chirag@gmail.com","230052469654");
        PersonDto personDto23 = new PersonDto("Kamal","kamal@gmail.com","230152669612");
        PersonDto personDto24 = new PersonDto("Mahesh","mahesh@gmail.com","230152269645");
        PersonDto personDto25 = new PersonDto("Prashanth","prahanth@gmail.com","230152469655");


        AddressDto addressDto1 = new AddressDto(22,"BTM 1st Stage","Bengaluru",566068);
        AddressDto addressDto2 = new AddressDto(21,"Madilvala","Bengaluru",566069);
        AddressDto addressDto3 = new AddressDto(20,"Chocolate Factory","Bengaluru",566067);
        AddressDto addressDto4 = new AddressDto(23,"SilkBoard","Bengaluru",566065);
        AddressDto addressDto5 = new AddressDto(24,"Marathalli","Bengaluru",566060);
        AddressDto addressDto6 = new AddressDto(12,"Navale","Shimoga",566068);
        AddressDto addressDto7 = new AddressDto(11,"CourtCircle","Shimoga",522069);
        AddressDto addressDto8 = new AddressDto(20,"Market","Shimoga",533067);
        AddressDto addressDto9 = new AddressDto(13,"Sasvehalli","Davangere",544065);
        AddressDto addressDto10 = new AddressDto(14,"VinobhNagar","Davangere",555060);
        AddressDto addressDto11 = new AddressDto(02,"Jayanaga 4th block","Jayanagar",566068);
        AddressDto addressDto12 = new AddressDto(71,"ChurchStreet 2nd stahe","ChurchStreet",577069);
        AddressDto addressDto13 = new AddressDto(40,"Malleshwaran 12 cross","Malleshwaram",568867);
        AddressDto addressDto14 = new AddressDto(33,"Majestic 3rd cross","Majestic",599065);
        AddressDto addressDto15 = new AddressDto(44,"Yashwanthpoor","Bengaluru",566060);
        AddressDto addressDto16 = new AddressDto(72,"BTM 1st Stage","Bengaluru",566068);
        AddressDto addressDto17 = new AddressDto(01,"Madilvala","Bengaluru",566069);
        AddressDto addressDto18 = new AddressDto(50,"Chocolate Factory","Bengaluru",566067);
        AddressDto addressDto19 = new AddressDto(43,"SilkBoard","Bengaluru",566065);
        AddressDto addressDto20 = new AddressDto(94,"Marathalli","Bengaluru",566060);
        AddressDto addressDto21 = new AddressDto(22,"BTM 1st Stage","Bengaluru",576068);
        AddressDto addressDto22 = new AddressDto(21,"Madilvala","Bengaluru",576069);
        AddressDto addressDto23 = new AddressDto(20,"Chocolate Factory","Bengaluru",576067);
        AddressDto addressDto24 = new AddressDto(23,"SilkBoard","Bengaluru",576065);
        AddressDto addressDto25 = new AddressDto(24,"Marathalli","Bengaluru",576060);

        Map<PersonDto,AddressDto> map = new HashMap<>();

        map.put(personDto1,addressDto1);
        map.put(personDto2,addressDto2);
        map.put(personDto3,addressDto3);
        map.put(personDto4,addressDto4);
        map.put(personDto5,addressDto5);
        map.put(personDto6,addressDto6);
        map.put(personDto7,addressDto7);
        map.put(personDto8,addressDto8);
        map.put(personDto9,addressDto9);
        map.put(personDto10,addressDto10);
        map.put(personDto11,addressDto11);
        map.put(personDto12,addressDto12);
        map.put(personDto13,addressDto13);
        map.put(personDto14,addressDto14);
        map.put(personDto15,addressDto15);
        map.put(personDto16,addressDto16);
        map.put(personDto17,addressDto17);
        map.put(personDto18,addressDto18);
        map.put(personDto19,addressDto19);
        map.put(personDto20,addressDto20);
        map.put(personDto21,addressDto21);
        map.put(personDto22,addressDto22);
        map.put(personDto23,addressDto23);
        map.put(personDto24,addressDto24);
        map.put(personDto25,addressDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);
    }
}
