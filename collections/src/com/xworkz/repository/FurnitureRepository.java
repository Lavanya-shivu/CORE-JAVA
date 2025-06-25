package com.xworkz.repository;

import com.xworkz.dto.FurnitureDto;

import java.util.Collection;

public interface FurnitureRepository {
    Collection<FurnitureDto> findAll();
}
