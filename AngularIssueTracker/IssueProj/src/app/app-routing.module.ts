import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CompanyComponent } from './company/company.component';
import { ContactusComponent } from './contactus/contactus.component';
import { CourierPartnerComponent } from './courier-partner/courier-partner.component';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { CustomerServiceComponent } from './customer-service/customer-service.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { HomeComponent } from './home/home.component';
import { OurservicesComponent } from './ourservices/ourservices.component';
import { ProductComponent } from './product/product.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { IssuepageComponent } from './issuepage/issuepage.component';
import { IssueWriteComponent } from './issue-write/issue-write.component';
import { IssuelistComponent } from './issuelist/issuelist.component';
import { SolveIssueComponent } from './solve-issue/solve-issue.component';


const routes: Routes = [{ path: 'home', component: HomeComponent },
{ path: 'company', component: CompanyComponent },
{ path: 'createCustomer', component: CustomerCreateComponent },
{ path: 'customerService', component: CustomerServiceComponent },
{ path: 'courierPartner', component: CourierPartnerComponent },
{ path: 'custlist', component: CustomerlistComponent },
{ path: 'product', component: ProductComponent },
{ path: 'ourservices', component: OurservicesComponent },
{ path: 'login', component: LoginPageComponent },
{ path: 'contactus', component: ContactusComponent },
{ path: 'issue', component: IssuepageComponent },
{ path: 'issuewrite', component: IssueWriteComponent },
{ path: 'issuelist', component: IssuelistComponent },
{ path: 'solveissue', component: SolveIssueComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
