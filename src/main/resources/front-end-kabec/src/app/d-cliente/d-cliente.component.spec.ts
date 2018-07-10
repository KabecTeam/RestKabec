import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DClienteComponent } from './d-cliente.component';

describe('DClienteComponent', () => {
  let component: DClienteComponent;
  let fixture: ComponentFixture<DClienteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DClienteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
