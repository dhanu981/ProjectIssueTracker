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
import com.mph.entity.Issue;
import com.mph.service.IssueService;





@RestController
@RequestMapping(value = "/issueapi")
@CrossOrigin(origins = "*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},
allowCredentials = "false",allowedHeaders = "*")
public class IssueController {

	@Autowired
	IssueService issueService;
	
	@GetMapping("/allissue")
	public ResponseEntity<List<Issue>> allIssue()
	{
		List<Issue> elist=issueService.getIssueList();
		System.out.println(elist);
		if(elist.isEmpty())
		{
			return new ResponseEntity<List<Issue>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Issue>>(elist,HttpStatus.OK);
		
	}
	
	@PostMapping("/createIssue")
	public Issue createIssue(@RequestBody Issue issue)
	{
		issueService.createIssue(issue);
		return issue;
	}
	
	@GetMapping("/getIssue/{id}")
	public ResponseEntity<Issue> getIssueById(@PathVariable("id") int issue_id)
	{
		Issue iss= issueService.getIssueById(issue_id);
		if(iss == null)
		{
			return new ResponseEntity<Issue>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Issue>(iss,HttpStatus.OK);
	}
	
	@PutMapping("/updateIssue")
	public ResponseEntity<List<Issue>> updateCustomer(@RequestBody Issue issue)
	{
		System.out.println("Update Rest () " + issue);
		List<Issue> uelist=issueService.updateIssue(issue);
		System.out.println(uelist);
		if(uelist.isEmpty())
		{
			return new ResponseEntity<List<Issue>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Issue>>(uelist,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteIssue/{id}")
	public ResponseEntity<List<Issue>> deleteIssue(@PathVariable("id") int issue_id)
	{
		List<Issue> delist=issueService.deleteIssue(issue_id);
		System.out.println(delist);
		if(delist.isEmpty())
		{
			return new ResponseEntity<List<Issue>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Issue>>(delist,HttpStatus.OK);
	}
}
