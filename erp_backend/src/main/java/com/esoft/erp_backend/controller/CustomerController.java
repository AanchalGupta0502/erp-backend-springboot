package com.esoft.erp_backend.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.esoft.erp_backend.entity.Customer;
import com.esoft.erp_backend.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
		return "Customer deleted successfully";
	}
}
