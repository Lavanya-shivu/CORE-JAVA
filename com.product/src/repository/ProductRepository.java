package repository;

import dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
