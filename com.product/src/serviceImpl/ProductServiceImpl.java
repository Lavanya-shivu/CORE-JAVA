package serviceImpl;

import dto.ProductDto;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public boolean save(ProductDto productDto) {
        System.out.println("Running save in ProductServiceImpl");

        if (productDto != null) {
            System.out.println("Product is not null");

            String name = productDto.getName();
            if (name != null && name.length() >= 3 && name.length() <= 20) {
                System.out.println("Valid Name");
            } else {
                System.out.println("Invalid Name");
                return false;
            }
            String type = productDto.getType();
            if (type != null) {
                System.out.println("Valid Type");
            } else {
                System.out.println("Invalid Type");
                return false;
            }
            String incomingPrice = productDto.getIncomingPrice();
            if (incomingPrice != null && !incomingPrice.isEmpty()) {
                double price = Double.parseDouble(incomingPrice);
                if (price >= 500 && price <= 150000) {
                    System.out.println("Valid Incoming Price");
                } else {
                    System.out.println("Invalid Incoming Price");
                    return false;
                }
                String sellingPrice = productDto.getSellingPrice();
                if (sellingPrice != null && !sellingPrice.isEmpty()) {
                    double SellingPrice = Double.parseDouble(sellingPrice);
                    if (SellingPrice >= 500 && SellingPrice <= 170000) {
                        System.out.println("Valid Selling Price");
                    } else {
                        System.out.println("Invalid Selling Price");
                        return false;
                    }
                    String mrp = productDto.getMrp();
                    if (mrp != null && !mrp.isEmpty()) {
                        double amount = Double.parseDouble(mrp);
                        if (amount >= 500 && amount <= 180000) {
                            System.out.println("Valid MRP");
                        } else {
                            System.out.println("Invalid MRP");
                            return false;
                        }
                        String description = productDto.getDescription();
                        if (description != null && description.length() >= 3 && description.length() <= 50) {
                            System.out.println("Valid Description");
                        } else {
                            System.out.println("Invalid Description");
                            return false;
                        }

                        String brand = productDto.getBrand();
                        if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
                            System.out.println("Valid Brand");
                        } else {
                            System.out.println("Invalid Brand");
                            return false;
                        }
                        String quantity = productDto.getQuantity();
                        if (quantity != null && !quantity.isEmpty()) {
                            int number = Integer.parseInt(quantity);
                            if (number >= 2) {
                                System.out.println("Valid Quantity");
                            } else {
                                System.out.println("Invalid Quantity");
                                return false;
                            }
                            String color = productDto.getColor();
                            if (color != null && !color.isEmpty()) {
                                System.out.println("Valid Color");
                            } else {
                                System.out.println("Invalid color");
                                return false;
                            }
                            String weight = productDto.getWeight();
                            if (weight != null && !weight.isEmpty()) {
                                System.out.println("Valid Weight");
                            } else {
                                System.out.println("Invalid Weight");
                                return false;
                            }
                            String manfDate = productDto.getManfDate();
                            if (manfDate != null && !manfDate.isEmpty()) {
                                System.out.println("Valid Manufacture Date");
                            } else {
                                System.out.println("Invalid Manufacture Date");
                                return false;
                            }
                            String warranty = productDto.getWarranty();
                            if (warranty != null && !warranty.isEmpty()) {
                                System.out.println("Valid Warranty");
                            } else {
                                System.out.println("Invalid Warranty");
                                return false;
                            }

                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}