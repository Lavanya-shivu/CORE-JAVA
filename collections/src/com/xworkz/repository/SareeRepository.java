package com.xworkz.repository;

import com.xworkz.dto.SareeDto;

import java.util.Collection;

public interface SareeRepository {
    Collection<SareeDto> findAll();
}
