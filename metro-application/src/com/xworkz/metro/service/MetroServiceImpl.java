package com.xworkz.metro.service;

import com.xworkz.metro.dto.MetroDto;

public class MetroServiceImpl implements MetroService {
    @Override
    public boolean book(MetroDto metroDto) {
    if(metroDto != null){
String name =metroDto.getName();
if(name.length()>2){
    System.out.println("Valid Name");
}else{
    System.out.println("Name must be more than 2 characters");
}
if(metroDto.getDateAndTime() == null || metroDto.getDateAndTime().isEmpty()){
    System.out.println("Invalid Date and Time");
}
if(metroDto.getFrom() == null || metroDto.getFrom().isEmpty()){
    System.out.println("Please select From address");
}
if(metroDto.getTo() == null || metroDto.getTo().isEmpty()){
    System.out.println("Please select To address");
}
if(metroDto.getNoOfTickets() == null || metroDto.getNoOfTickets().isEmpty()){
    System.out.println("No of Tickets must not be empty");
}
if(metroDto.getStudent() == null || metroDto.getStudent().isEmpty()){
    System.out.println("Please mention if tou are a student");
}
    }
        return true;
    }
}
