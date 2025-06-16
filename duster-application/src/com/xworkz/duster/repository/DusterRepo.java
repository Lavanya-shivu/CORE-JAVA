package com.xworkz.duster.repository;

import com.xworkz.duster.dto.DusterDto;

import java.util.Optional;

public interface DusterRepo {
    boolean persist(DusterDto dusterDto);
    default Optional<DusterDto> findById(int Id){
        return Optional.empty();
    }
}
