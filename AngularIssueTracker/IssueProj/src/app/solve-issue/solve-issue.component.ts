import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-solve-issue',
  templateUrl: './solve-issue.component.html',
  styleUrls: ['./solve-issue.component.css']
})
export class SolveIssueComponent implements OnInit {
  @Input()
  public issueDetails = { issue_name: ''};
  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  gotoCompany(){
    alert("Issue solved..!!")
    this.router.navigate(['/company']);
  }

}
