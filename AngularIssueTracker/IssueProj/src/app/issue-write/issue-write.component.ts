import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { IssueService } from '../issue.service';

@Component({
  selector: 'app-issue-write',
  templateUrl: './issue-write.component.html',
  styleUrls: ['./issue-write.component.css']
})
export class IssueWriteComponent implements OnInit {
  @Input()
  public issueDetails = { issue_name: ''};
  
  constructor(private restApi: IssueService, public router: Router) { }

  ngOnInit(): void {
  }

  gotoCs(){
    console.log(this.issueDetails);
    this.restApi
      .createIssue(this.issueDetails)
      .subscribe((data: {}) => this.router.navigate(['/issuelist']));
  }

}
