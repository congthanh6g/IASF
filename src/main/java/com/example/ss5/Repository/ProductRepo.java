package com.example.ss5.Repository;

import com.example.ss5.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
