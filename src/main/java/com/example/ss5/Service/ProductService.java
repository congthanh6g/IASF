package com.example.ss5.Service;

import com.example.ss5.Entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();
    ProductEntity saveProduct(ProductEntity productEntity);
}
