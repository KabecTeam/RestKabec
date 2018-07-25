import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Complemento } from '../models/complemento.model';
import { ComplementoService } from './complemento.service';
import { LayoutService } from 'angular-admin-lte';

@Component({
  selector: 'app-complemento',
  templateUrl: './complemento.component.html',
  styleUrls: ['./complemento.component.css']
})

export class ComplementoComponent implements OnInit {

  complementos: Complemento[];

  constructor(private router: Router, private complementoService: ComplementoService) {

  }

  ngOnInit() {
    this.complementoService.getComplemento().subscribe( data => {
           this.complementos = data;
         });
     };


     deleteComplemento(complemento: Complemento): void {
         this.complementoService.deleteComplemento(complemento)
           .subscribe( data => {
             this.complementos = this.complementos.filter(u => u !== complemento);
           })
       };

     }
