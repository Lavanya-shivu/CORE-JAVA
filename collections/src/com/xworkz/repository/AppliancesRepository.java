package com.xworkz.repository;

import com.xworkz.dto.AppliancesDto;

import java.util.Collection;

public interface AppliancesRepository {
    Collection<AppliancesDto> findAll();
}
