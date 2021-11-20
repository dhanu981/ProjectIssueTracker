import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';
import { Customer } from '../Customer';

@Component({
  selector: 'app-customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent implements OnInit {
  public customers = [] as any;
  public selectedId: number = 0;
 
  constructor(private eservice: CustomerService, private router: Router) {}

  ngOnInit(): void {

    
    this.eservice
    .getCustomerFromService()
    .subscribe((data) => (this.customers = data));
  }

}
