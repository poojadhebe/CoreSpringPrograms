package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	/**
	 * @param customerRepository the customerRepository to set
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
