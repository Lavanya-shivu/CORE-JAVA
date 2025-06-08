package com.xworkz.image.runner;

import com.xworkz.image.dto.ImageDto;
import com.xworkz.image.service.ImageService;
import com.xworkz.image.service.ImageServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImageRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImageService imageService = new ImageServiceImpl();

        try{
            System.out.println("Enter image width");
            int width = scanner.nextInt();

            System.out.println("Enter image Height");
            int height = scanner.nextInt();

            ImageDto imageDto = new ImageDto(width,height);
            imageService.resize(imageDto);
            }catch (InputMismatchException e){
            System.out.println("Enter numeric value for width and height");
        }catch (IllegalArgumentException e){
            System.out.println("Error:" +e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Error:" +e.getMessage());
        }finally {
            System.out.println("Image resized");
            scanner.close();
        }
    }
}
