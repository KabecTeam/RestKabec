import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReporteasignadosComponent } from './reporteasignados.component';

describe('ReporteasignadosComponent', () => {
  let component: ReporteasignadosComponent;
  let fixture: ComponentFixture<ReporteasignadosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReporteasignadosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReporteasignadosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
