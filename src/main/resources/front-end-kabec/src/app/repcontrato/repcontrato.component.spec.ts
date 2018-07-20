import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RepcontratoComponent } from './repcontrato.component';

describe('RepcontratoComponent', () => {
  let component: RepcontratoComponent;
  let fixture: ComponentFixture<RepcontratoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RepcontratoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RepcontratoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
