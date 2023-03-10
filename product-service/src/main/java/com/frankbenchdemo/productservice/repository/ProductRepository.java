package com.frankbenchdemo.productservice.repository;

import com.frankbenchdemo.productservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
