import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-issuepage',
  templateUrl: './issuepage.component.html',
  styleUrls: ['./issuepage.component.css']
})
export class IssuepageComponent implements OnInit {

  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  registerIssue(){
    this.router.navigate(['/issuewrite']);
  }

}
