package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.OrderRequest;
import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository custRepo;

	@PostMapping("/saveOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return custRepo.save(request.getCustomer());
	}

}
