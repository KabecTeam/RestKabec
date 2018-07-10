import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PagosAnexoComponent } from './pagos-anexo.component';

describe('PagosAnexoComponent', () => {
  let component: PagosAnexoComponent;
  let fixture: ComponentFixture<PagosAnexoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PagosAnexoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PagosAnexoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
