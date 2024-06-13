package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Customer;



public interface CustomerRepository extends MongoRepository<Customer, Integer>{

	@SuppressWarnings("unchecked")
	Customer save(Customer cus);
	
}
