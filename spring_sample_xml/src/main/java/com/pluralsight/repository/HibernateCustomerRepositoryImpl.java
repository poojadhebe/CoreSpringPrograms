package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll(){
		List<Customer> customerList=new ArrayList<Customer>();
		Customer customer=new Customer();
		customer.setFirstName("Pooja");
		customer.setLastName("Khatal");
		customerList.add(customer);
		return customerList;
	}
	
}
