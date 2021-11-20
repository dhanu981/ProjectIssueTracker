import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, retry, throwError } from 'rxjs';
import { Customer } from './Customer';


@Injectable({
  providedIn: 'root',
})
export class CustomerService {
  private restUrl: string = 'http://localhost:8080/issutracker/customerapi';
  constructor(private http: HttpClient) {}

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  getCustomerFromService(): Observable<Customer[]> {
    return this.http
    .get<Customer[]>(this.restUrl + '/allcust')
      .pipe(retry(1), catchError(this.handleError));
  }


  createCustomer(customer: any): Observable<Customer> {
   
    return this.http.post<Customer>(
        this.restUrl + '/createCustomer',
        JSON.stringify(customer),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
      
  }

  deleteCustomer(cust_id: number) {
    return this.http
      .delete<Customer>(
        this.restUrl + '/deleteCustomer/' + cust_id,
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }

  getCustomer(cust_id: any): Observable<Customer> {
    return this.http
      .get<Customer>(this.restUrl + '/getCustomer/' + cust_id, this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }

  updateCustomer(customer: any): Observable<Customer> {
    console.log('from service update() ' + customer);
    return this.http
      .put<Customer>(
        this.restUrl + '/updateCustomer',
        JSON.stringify(customer),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
      }
 
  handleError(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Codeeee : ${error.status} \n Error Messageeee : ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  }


 
}
console.log('From service.ts');










































/* 
deleteCustomer(cust_id: number) {
    return this.http
      .delete<Customer>(
        this.restUrl + '/deleteCustomer/' + cust_id,
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }

  getEmployee(eid: any): Observable<Employee> {
    return this.http
      .get<Employee>(this.restUrl + '/getEmployee/' + eid, this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }

  updateEmployee(employee: any): Observable<Employee> {
    console.log('from service update() ' + employee);
    return this.http
      .put<Employee>(
        this.restUrl + '/updateEmployee',
        JSON.stringify(employee),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }*/