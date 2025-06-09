package com.xworkz.zoom.service;

import com.xworkz.zoom.dto.ZoomDto;
import com.xworkz.zoom.exception.InvalidZoomLevelException;

public class ZoomServiceImpl implements ZoomService{
    private static final int MAX_ZOOM=20;
    @Override
    public boolean validate(ZoomDto zoomDto) throws InvalidZoomLevelException {
        if(zoomDto == null){
            throw new NullPointerException("ZoomDto is null");
        }
        int level = zoomDto.getZoomLevel();
        if(level>MAX_ZOOM){
            throw new InvalidZoomLevelException("Zoom level"+level+"exceeds max limit of"+MAX_ZOOM);
        }
        System.out.println("Zoom level"+level+"is valid");
        return true;
    }
}
