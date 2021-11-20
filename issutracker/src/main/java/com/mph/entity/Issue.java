package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Issue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int issue_id;
	@Column
	private String issue_name;
	
	
	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Issue(int issue_id, String issue_name) {
		super();
		this.issue_id = issue_id;
		this.issue_name = issue_name;
	}


	public int getIssue_id() {
		return issue_id;
	}


	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}


	public String getIssue_name() {
		return issue_name;
	}


	public void setIssue_name(String issue_name) {
		this.issue_name = issue_name;
	}


	@Override
	public String toString() {
		return "Issue [issue_id=" + issue_id + ", issue_name=" + issue_name + "]";
	}
	
	
}
