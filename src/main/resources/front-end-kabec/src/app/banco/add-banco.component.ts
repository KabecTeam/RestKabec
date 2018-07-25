import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Banco } from '../models/banco.model';
import { BancoService } from './banco.service';
import { LayoutService } from 'angular-admin-lte';

@Component({
  templateUrl: './add-banco.component.html',
  styleUrls: ['./banco.component.css']
})
export class AddBancoComponent {

  banco: Banco=new Banco();

  constructor(private router: Router, private bancoService: BancoService) {

  }

  createBanco(): void {
      this.bancoService.createBanco(this.banco)
        .subscribe( data => {
          alert("Banco creado con exito");
        });
    };

  }
