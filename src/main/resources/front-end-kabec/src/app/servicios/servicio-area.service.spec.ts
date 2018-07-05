import { TestBed, inject } from '@angular/core/testing';

import { ServicioAreaService } from './servicio-area.service';

describe('ServicioAreaService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ServicioAreaService]
    });
  });

  it('should be created', inject([ServicioAreaService], (service: ServicioAreaService) => {
    expect(service).toBeTruthy();
  }));
});
