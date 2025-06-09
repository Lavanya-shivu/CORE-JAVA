package com.xworkz.zoom.runner;

import com.xworkz.zoom.dto.ZoomDto;
import com.xworkz.zoom.exception.InvalidZoomLevelException;
import com.xworkz.zoom.service.ZoomService;
import com.xworkz.zoom.service.ZoomServiceImpl;

import java.util.Scanner;

public class ZoomRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZoomService zoomService = new ZoomServiceImpl();

        System.out.println("Enter map zoom level");
        int zoom = scanner.nextInt();

        ZoomDto zoomDto = new ZoomDto(zoom);

        try{
            zoomService.validate(zoomDto);
        } catch (InvalidZoomLevelException e) {
            System.out.println("Error:" +e.getMessage());
        }
    }
}
