package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//Member variable autowiring
	//@Autowired
	CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	/**
	 * @param customerRepository the customerRepository to set
	 */
	//Setter injection autowiring
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("Using setter injection");
	}

	
	public CustomerServiceImpl() {
		super();
	}
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("Using constructor injection");
		this.customerRepository = customerRepository;
	}
	
	
	
	
	
}
