package com.esoft.erp_backend.service;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.erp_backend.entity.*;
import com.esoft.erp_backend.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	public CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer) {
		if(customer.getContactPersons()!=null) {
			for(CustomerDtl dtl :customer.getContactPersons()) {
				dtl.setCustomer(customer);
			}
		}
		
		if(customer.getConsignees()!=null) {
			for(CustomerDtl1 dtl1:customer.getConsignees()) {
				dtl1.setCustomer(customer);
			}
		}
		
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Long id) {
		Optional<Customer> customer=customerRepository.findById(id);
		return customer.orElse(null);
	}
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
	
	public Customer updateCustomer(Long id, Customer customer) {
		customer.setEntryNo(id);
		
		if(customer.getContactPersons()!=null) {
			for(CustomerDtl dtl:customer.getContactPersons()) {
				dtl.setCustomer(customer);
			}
		}
		
		if(customer.getConsignees()!=null) {
			for(CustomerDtl1 dtl1:customer.getConsignees()) {
				dtl1.setCustomer(customer);
			}
		}
		return customerRepository.save(customer);
	}
}
