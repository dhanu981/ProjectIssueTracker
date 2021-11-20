import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IssueWriteComponent } from './issue-write.component';

describe('IssueWriteComponent', () => {
  let component: IssueWriteComponent;
  let fixture: ComponentFixture<IssueWriteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IssueWriteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IssueWriteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
