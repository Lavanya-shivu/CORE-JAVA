package com.xworkz.zoom.service;

import com.xworkz.zoom.dto.ZoomDto;
import com.xworkz.zoom.exception.InvalidZoomLevelException;

public interface ZoomService {
    boolean validate(ZoomDto zoomDto) throws InvalidZoomLevelException;
}
