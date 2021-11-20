import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IssuepageComponent } from './issuepage.component';

describe('IssuepageComponent', () => {
  let component: IssuepageComponent;
  let fixture: ComponentFixture<IssuepageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IssuepageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IssuepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
