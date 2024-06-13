package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Product;

public interface ProductRepository extends MongoRepository<Product,Integer>{

}
