package com.xworkz.collection.runner;

import com.xworkz.collection.dto.ProductDto;
import com.xworkz.collection.repository.ProductRepository;
import com.xworkz.collection.repository.ProductRepositoryImpl;

import java.util.Collection;

public class ProductRunner {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryImpl();
        Collection<ProductDto> productDtos = productRepository.findAll();

        // 1. Print all product info
        System.out.println("All products info");
        productDtos.forEach(System.out::println);
        System.out.println("=====================================================");

        // 2. Print all names of the product
        System.out.println("All product names");
        productDtos.stream().map(ProductDto::getName).forEach(System.out::println);
        System.out.println("=====================================================");

        // 3. Products with discount > 10%
        System.out.println("All products with discount > 10%");
        productDtos.stream().filter(productDto -> productDto.getDiscount()>10).forEach(System.out::println);
        System.out.println("=====================================================");

       // 4. Collect all product if warranty less than 3
        System.out.println("All products with discount < 3");
        productDtos.stream().filter(productDto -> productDto.getId()<3).forEach(System.out::println);
        System.out.println("=====================================================");

        //5. Sort all product by id asc
        System.out.println("All product ID in ascending order");
        productDtos.stream().sorted((a,b)->Integer.compare(a.getId(),b.getId())).forEach(System.out::println);
        System.out.println("=====================================================");

        //6. Collect all product if quantity > 5 and sort by id
        System.out.println("All products where quantity is > 5");
        productDtos.stream().filter(productDto -> productDto.getQuantity()>5).forEach(System.out::println);
        System.out.println("=====================================================");

        //7. Collect only manufacturer of all product
        System.out.println("All product manufacturers");
        productDtos.stream().map(ProductDto::getManufacturer).distinct().forEach(System.out::println);
        System.out.println("=====================================================");

        //8. get the product with min discount
        System.out.println("All the products with min discount");
        productDtos.stream().min((a,b)->Double.compare(a.getDiscount(), b.getDiscount())).ifPresent(System.out::println);
        System.out.println("=====================================================");

        //9. get the product with latest manufacturedDate
        System.out.println("Products with latest manufacturedDate");
        productDtos.stream().max((a,b)->a.getManufactureDate().compareTo(b.getManufactureDate())).ifPresent(System.out::println);
        System.out.println("=====================================================");

        //10. get the product with max costPerItem
        System.out.println("Product with max costPerItem");
        productDtos.stream().max((a,b)->Double.compare(a.getCostPerItem(),b.getCostPerItem())).ifPresent(System.out::println);

    }
}
