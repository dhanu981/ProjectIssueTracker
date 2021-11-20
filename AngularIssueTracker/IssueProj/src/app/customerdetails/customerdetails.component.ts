import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customerdetails',
  templateUrl: './customerdetails.component.html',
  styleUrls: ['./customerdetails.component.css']
})
export class CustomerdetailsComponent implements OnInit {
  public customers = [] as any;
 
  constructor(private eservice: CustomerService) {}

  ngOnInit(): void {
    this.eservice
      .getCustomerFromService()
      .subscribe((data) => (this.customers = data));
  }

}
