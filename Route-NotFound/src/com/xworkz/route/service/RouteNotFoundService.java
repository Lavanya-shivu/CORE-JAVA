package com.xworkz.route.service;

import com.xworkz.route.dto.RouteNotFoundDto;
import com.xworkz.route.exception.RouteNotFoundException;

public interface RouteNotFoundService {
    boolean checkRoute(RouteNotFoundDto routeNotFoundDto) throws RouteNotFoundException;
}
