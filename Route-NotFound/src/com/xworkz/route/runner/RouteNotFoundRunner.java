package com.xworkz.route.runner;

import com.xworkz.route.dto.RouteNotFoundDto;
import com.xworkz.route.exception.RouteNotFoundException;
import com.xworkz.route.service.RouteNotFoundService;
import com.xworkz.route.service.RouteNotFoundServiceImpl;

import java.util.Scanner;

public class RouteNotFoundRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RouteNotFoundService routeNotFoundService = new RouteNotFoundServiceImpl();
        System.out.println("Enter Destination");
        String destination = scanner.nextLine();

        RouteNotFoundDto routeNotFoundDto = new RouteNotFoundDto(destination);

        try{
            routeNotFoundService.checkRoute(routeNotFoundDto);
        }catch (RouteNotFoundException e){
            System.out.println("Error:" +e.getMessage());
        }
    }
}
