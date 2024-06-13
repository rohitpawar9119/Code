package com.demo.dto;

import com.demo.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

	private Customer customer;

	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
