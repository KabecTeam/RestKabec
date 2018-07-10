import { TestBed, inject } from '@angular/core/testing';

import { PagosAnexosService } from './pagos-anexos.service';

describe('PagosAnexosService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PagosAnexosService]
    });
  });

  it('should be created', inject([PagosAnexosService], (service: PagosAnexosService) => {
    expect(service).toBeTruthy();
  }));
});
