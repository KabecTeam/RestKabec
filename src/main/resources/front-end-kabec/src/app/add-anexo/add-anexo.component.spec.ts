import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddAnexoComponent } from './add-anexo.component';

describe('AddAnexoComponent', () => {
  let component: AddAnexoComponent;
  let fixture: ComponentFixture<AddAnexoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddAnexoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddAnexoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
