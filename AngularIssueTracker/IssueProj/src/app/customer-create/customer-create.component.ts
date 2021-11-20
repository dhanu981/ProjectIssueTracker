import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  @Input()
  public customerDetails = {cust_name:'' , cust_email: '', cust_password: '' , cust_address: '' ,cust_mobile:'',cust_gender:''};
  
  constructor(private restApi: CustomerService, public router: Router) {}

  ngOnInit(): void {
  }
  addCustomer() {
   
    alert("Registration Succesful!  ")
   
    this.restApi
    .createCustomer(this.customerDetails)
    .subscribe((data: {}) => this.router.navigate(['/login'])); // navigate to other page
 
  }

}

//cust_name:'' , cust_email: '', cust_password: '' , cust_address: '' ,cust_mobile:'',cust_gender:''