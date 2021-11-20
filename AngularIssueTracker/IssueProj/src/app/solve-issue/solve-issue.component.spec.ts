import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SolveIssueComponent } from './solve-issue.component';

describe('SolveIssueComponent', () => {
  let component: SolveIssueComponent;
  let fixture: ComponentFixture<SolveIssueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SolveIssueComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SolveIssueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
