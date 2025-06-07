package com.xworkz.guessthenumber.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GuessTheNumberDto {
private int numberToGuess;
private int randomNumber;
}
