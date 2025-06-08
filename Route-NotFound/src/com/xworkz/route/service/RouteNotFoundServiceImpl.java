package com.xworkz.route.service;

import com.xworkz.route.dto.RouteNotFoundDto;
import com.xworkz.route.exception.RouteNotFoundException;

import java.util.Scanner;

public class RouteNotFoundServiceImpl implements RouteNotFoundService{
    @Override
    public boolean checkRoute(RouteNotFoundDto routeNotFoundDto) throws RouteNotFoundException {
        Scanner scanner = new Scanner(System.in);
        RouteNotFoundService routeNotFoundService = new RouteNotFoundServiceImpl();
        System.out.println("Enter Destination");

        if(routeNotFoundDto == null){
            throw new NullPointerException("RouteNotFoundDto is null");
        }
        String destination = routeNotFoundDto.getDestination();

        if("Bangalore".equalsIgnoreCase(destination)){
            System.out.println("Route found: Bangalore -> Mysore");
            return true;
        }else {
            throw new RouteNotFoundException("Route"+destination+"not found");
        }

    }
}
