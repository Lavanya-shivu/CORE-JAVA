package com.xworkz.image.service;

import com.xworkz.image.dto.ImageDto;

public class ImageServiceImpl implements ImageService{
    @Override
    public void resize(ImageDto imageDto) {
        if (imageDto == null) {
            throw new NullPointerException("ImageDto is null");
        }
        if (imageDto.getWidth() < 0 || imageDto.getHeight() < 0) {
            throw new IllegalArgumentException("Width and Height must not be negative");
        }
        System.out.println("Image resize to width" + imageDto.getWidth() + "and height" + imageDto.getHeight());
    }
}
