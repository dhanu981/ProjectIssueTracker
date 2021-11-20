package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Customer;

import com.mph.service.CustomerService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@RequestMapping(value = "/customerapi")
@EnableSwagger2
@CrossOrigin(origins = "*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},
allowCredentials = "false",allowedHeaders = "*")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/allcust")
	public ResponseEntity<List<Customer>> allCustomer()
	{
		List<Customer> elist=customerService.getCustomerList();
		System.out.println(elist);
		if(elist.isEmpty())
		{
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Customer>>(elist,HttpStatus.OK);
		
	}
	
	@PostMapping("/createCustomer")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		customerService.createCustomer(customer);
		return customer;
	}
	
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int cust_id)
	{
		Customer cust= customerService.getCustomerById(cust_id);
		if(cust == null)
		{
			return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer customer)
	{
		System.out.println("Update Rest () " + customer);
		List<Customer> uelist=customerService.updateCustomer(customer);
		System.out.println(uelist);
		if(uelist.isEmpty())
		{
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Customer>>(uelist,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable("id") int cust_id)
	{
		List<Customer> delist=customerService.deleteCustomer(cust_id);
		System.out.println(delist);
		if(delist.isEmpty())
		{
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Customer>>(delist,HttpStatus.OK);
	}
}
