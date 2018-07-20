import { Component } from '@angular/core';
import { Router } from '@angular/router';


import { Nomina } from '../models/nomina.model';
import { NominaService } from './nomina.service';

@Component({
  templateUrl: './add-nomina.component.html',
  styleUrls: ['./nomina.component.css']
})

export class AddNominaComponent {

  nomina: Nomina = new Nomina();

  constructor(private router: Router, private nominaService: NominaService) {

  }

  createNomina(): void {
    this.nominaService.createNomina(this.nomina)
        .subscribe( data => {
          alert("Contrato nomina guardado con exito.");
        });

  };

}
