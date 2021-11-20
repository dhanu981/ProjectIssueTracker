import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { IssueService } from '../issue.service';


@Component({
  selector: 'app-issuelist',
  templateUrl: './issuelist.component.html',
  styleUrls: ['./issuelist.component.css']
})

export class IssuelistComponent implements OnInit {
  public issues = [] as any;
  public selectedId: number = 0;

 
 // public issue_id: any = this.aroute.snapshot.params['issue_id'];
  @Input()
  public issueDetails = { issue_name: ''};
  constructor(private eservice: IssueService, private router: Router,  private aroute: ActivatedRoute) { }

  ngOnInit(): void {
    this.eservice
    .getIssueFromService()
    .subscribe((data: any) => (this.issues = data));
    //console.log('from ng oninit ' + this.issue_id + this.selectedId);
  }

  /*ngOnInit(): void {
    console.log('from ng onint ' + this.issue_id + this.selectedId);
    this.restApi.getIssue(this.issue_id).subscribe((data) => {
      this.issueData = data;
    });
    console.log('from ng oninit ' + this.issue_id + this.selectedId);
  }*/

  solveIssue(){
    /*
    console.log('employee data ---' + this.issueData);
    this.restApi
      .getIssue(this.issueData)
      .subscribe((data: {}) => this.router.navigate(['/solveissue']));*/


   console.log(this.issueDetails);
    this.eservice
    .getIssueFromService()
      .subscribe((data: {}) => this.router.navigate(['/solveissue']));
  }

}
