package com.xworkz.repository;

import com.xworkz.dto.BeautyProductsDto;

import java.util.Collection;

public interface BeautyProductsRepository {
    Collection<BeautyProductsDto> findAll();
}
