package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Will");
		customer.setLastName("Mallett");
		
		customers.add(customer);
		
		return customers;
	}
	
}
