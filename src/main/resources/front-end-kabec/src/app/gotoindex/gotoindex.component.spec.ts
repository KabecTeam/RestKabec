import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GotoindexComponent } from './gotoindex.component';

describe('GotoindexComponent', () => {
  let component: GotoindexComponent;
  let fixture: ComponentFixture<GotoindexComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GotoindexComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GotoindexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
