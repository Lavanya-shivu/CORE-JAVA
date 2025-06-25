package com.xworkz.repository;

import com.xworkz.dto.FridgeDto;

import java.util.Collection;

public interface FridgeRepository {
    Collection<FridgeDto> findAll();

    }


