package com.xworkz.duster.service;

import com.xworkz.duster.dto.DusterDto;

import java.util.Optional;

public interface DusterService {
    boolean save(DusterDto dusterDto);
    default Optional<DusterDto> findById(int id)
    {
        return Optional.empty();
    }
}
