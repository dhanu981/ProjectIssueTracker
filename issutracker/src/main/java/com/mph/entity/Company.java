package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
 public class Company {
 
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int compid;
	 
	    private String name;
		private String address;
		public Company() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		public Company(int compid, String name, String address) {
			super();
			this.compid = compid;
			this.name = name;
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		

		public int getCompid() {
			return compid;
		}

		public void setCompid(int compid) {
			this.compid = compid;
		}

		@Override
		public String toString() {
			return "Company [comp_id=" + compid + ", name=" + name + ", address=" + address + "]";
		}

		
		
}
       
	
	
	
