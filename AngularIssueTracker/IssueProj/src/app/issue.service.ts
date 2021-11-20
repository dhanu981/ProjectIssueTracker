import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, retry, throwError } from 'rxjs';
import { Issue } from './Issue';

@Injectable({
  providedIn: 'root'
})
export class IssueService {
  private restUrl: string = 'http://localhost:8080/issutracker/issueapi';
  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  getIssueFromService(): Observable<Issue[]> {
    return this.http
    .get<Issue[]>(this.restUrl + '/allissue')
      .pipe(retry(1), catchError(this.handleError));
  }

  createIssue(issue: any): Observable<Issue> {

    return this.http.post<Issue>(
        this.restUrl + '/createIssue',
        JSON.stringify(issue),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
      
  }

  getIssue(issue_id: any): Observable<Issue> {
    return this.http
      .get<Issue>(this.restUrl + '/getIssue/' + issue_id, this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }

  updateIssue(issue: any): Observable<Issue> {
    console.log('from service update() ' + issue);
    return this.http
      .put<Issue>(
        this.restUrl + '/updateIssue',
        JSON.stringify(issue),
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
