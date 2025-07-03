package com.xworkz.collection.repository;

import com.xworkz.collection.dto.ProductDto;

import java.util.Collection;

public interface ProductRepository {
    Collection<ProductDto> findAll();
}
