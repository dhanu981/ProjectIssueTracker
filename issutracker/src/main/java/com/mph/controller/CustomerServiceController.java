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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Customer;
import com.mph.entity.CustomerServiceE;
import com.mph.service.CustomerServService;
import com.mph.service.CustomerService;

@RestController
@RequestMapping(value = "/customerserv")
@CrossOrigin(origins = "http://localhost:4200",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},
allowCredentials = "false",allowedHeaders = "*")
public class CustomerServiceController {
	
	@Autowired
	CustomerServService customerServService;
	
	@GetMapping("/allcse")
	public ResponseEntity<List<CustomerServiceE>> allCustomerServiceE()
	{
		List<CustomerServiceE> elist=customerServService.getCustomerServiceEList();
		System.out.println(elist);
		if(elist.isEmpty())
		{
			return new ResponseEntity<List<CustomerServiceE>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CustomerServiceE>>(elist,HttpStatus.OK);
		
	}
	
	@PostMapping("/createCustomerService")
	public CustomerServiceE createCustomerServiceE(@RequestBody CustomerServiceE customerServiceE)
	{
		customerServService.createCustomerServiceE(customerServiceE);
		return customerServiceE;
	}
	
	
	
	@DeleteMapping("/deleteCustomerServiceE/{id}")
	public ResponseEntity<List<CustomerServiceE>> deleteCustomerServiceE(@PathVariable("id") int ser_id)
	{
		List<CustomerServiceE> delist=customerServService.deleteCustomerServiceE(ser_id);
		System.out.println(delist);
		if(delist.isEmpty())
		{
			return new ResponseEntity<List<CustomerServiceE>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CustomerServiceE>>(delist,HttpStatus.OK);
	}
	
}


/*@GetMapping("/getCustomer/{id}")
public ResponseEntity<CustomerServiceE> getCustomerServiceEById(@PathVariable("id") int ser_id)
{
	CustomerServiceE cust= customerServService.getCustomerServiceEById(ser_id);
	if(cust == null)
	{
		return new ResponseEntity<CustomerServiceE>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<CustomerServiceE>(cust,HttpStatus.OK);
}*/