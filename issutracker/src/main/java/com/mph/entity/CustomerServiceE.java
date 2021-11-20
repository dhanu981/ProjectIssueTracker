package com.mph.entity; 
import javax.persistence.Column;


import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  

 

@Entity 
public class CustomerServiceE 
{ 		
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ser_id;
	
	@Column
	private String view_issue;
	@Column
	private String solve_issue;
	@Column
	private String report_issue;
	public CustomerServiceE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerServiceE(long ser_id, String view_issue, String solve_issue, String report_issue) {
		super();
		this.ser_id = ser_id;
		this.view_issue = view_issue;
		this.solve_issue = solve_issue;
		this.report_issue = report_issue;
	}
	public long getSer_id() {
		return ser_id;
	}
	public void setSer_id(long ser_id) {
		this.ser_id = ser_id;
	}
	public String getView_issue() {
		return view_issue;
	}
	public void setView_issue(String view_issue) {
		this.view_issue = view_issue;
	}
	public String getSolve_issue() {
		return solve_issue;
	}
	public void setSolve_issue(String solve_issue) {
		this.solve_issue = solve_issue;
	}
	public String getReport_issue() {
		return report_issue;
	}
	public void setReport_issue(String report_issue) {
		this.report_issue = report_issue;
	}
	@Override
	public String toString() {
		return "CustomerServiceE [ser_id=" + ser_id + ", view_issue=" + view_issue + ", solve_issue=" + solve_issue
				+ ", report_issue=" + report_issue + "]";
	}
	
	
	
}	