import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InisessionComponent } from './inisession.component';

describe('InisessionComponent', () => {
  let component: InisessionComponent;
  let fixture: ComponentFixture<InisessionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InisessionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InisessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
