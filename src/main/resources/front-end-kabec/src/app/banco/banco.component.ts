import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Banco } from '../models/banco.model';
import { BancoService } from './banco.service';

@Component({
  selector: 'app-banco',
  templateUrl: './banco.component.html',
  styleUrls: ['./banco.component.css']
})
export class BancoComponent implements OnInit {

  bancos : Banco[];

  constructor(private router: Router, private bancoService: BancoService) {

  }

  ngOnInit() {
 this.bancoService.getBanco().subscribe( data => {
        this.bancos = data;
      });
  };


  deleteBanco(banco: Banco): void {
      this.bancoService.deleteBanco(banco)
        .subscribe( data => {
          this.bancos = this.bancos.filter(u => u !== banco);
        })
    };

  }
