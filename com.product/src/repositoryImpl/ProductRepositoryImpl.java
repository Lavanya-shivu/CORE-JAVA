package repositoryImpl;

import dto.ProductDto;
import repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {
    public ProductRepositoryImpl(){
        System.out.println("Running save in ProductRepository");
    }

    @Override
    public boolean persist(ProductDto productDto) {
        return true;
    }
}
