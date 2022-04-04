import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangepassworduserComponent } from './changepassworduser.component';

describe('ChangepassworduserComponent', () => {
  let component: ChangepassworduserComponent;
  let fixture: ComponentFixture<ChangepassworduserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChangepassworduserComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangepassworduserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
