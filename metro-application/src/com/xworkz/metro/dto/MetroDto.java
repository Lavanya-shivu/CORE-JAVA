package com.xworkz.metro.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MetroDto {
    private String name;
    private String dateAndTime;
    private String from;
    private String to;
    private String noOfTickets;
    private String student;
}
