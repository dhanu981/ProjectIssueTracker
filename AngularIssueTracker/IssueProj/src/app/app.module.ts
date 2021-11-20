import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CompanyComponent } from './company/company.component';
import { CustomerServiceComponent } from './customer-service/customer-service.component';
import { CourierPartnerComponent } from './courier-partner/courier-partner.component';
import { ProductComponent } from './product/product.component';
import { HomeComponent } from './home/home.component';
import { OurservicesComponent } from './ourservices/ourservices.component';
import { ContactusComponent } from './contactus/contactus.component';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { CustomerdetailsComponent } from './customerdetails/customerdetails.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { IssuepageComponent } from './issuepage/issuepage.component';
import { IssueWriteComponent } from './issue-write/issue-write.component';
import { IssuelistComponent } from './issuelist/issuelist.component';
import { SolveIssueComponent } from './solve-issue/solve-issue.component';
import { LogoutComponent } from './logout/logout.component';


@NgModule({
  declarations: [
    AppComponent,
    CompanyComponent,
    CustomerServiceComponent,
    CourierPartnerComponent,
    ProductComponent,
    HomeComponent,
    OurservicesComponent,
    ContactusComponent,
    CustomerCreateComponent,
    CustomerdetailsComponent,
    CustomerlistComponent,
    LoginPageComponent,
    IssuepageComponent,
    IssueWriteComponent,
    IssuelistComponent,
    SolveIssueComponent,
    LogoutComponent,
   
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule,FormsModule],
  providers: [],
  bootstrap: [AppComponent],

})
export class AppModule { }
