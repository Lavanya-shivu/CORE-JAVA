package com.xworkz.repository;

import com.xworkz.dto.CampingDto;

import java.util.Collection;

public interface CampingRepository {
    Collection<CampingDto> findAll();
}
