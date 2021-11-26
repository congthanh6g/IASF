package com.example.ss5.Service;

import com.example.ss5.Entity.ProductEntity;
import com.example.ss5.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepo.save(productEntity);
    }
}
