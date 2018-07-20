import { Component, OnInit, Input, EventEmitter, OnDestroy, HostListener } from '@angular/core';
import { Router } from '@angular/router';

import { Contrato,CONTRATOS } from '../models/contrato.model';
import { ContratoService } from './repcontrato.service';

import * as jsPDF from 'jspdf';
import 'jspdf-autotable';


@Component({
  selector: 'app-repcontrato',
  templateUrl: './repcontrato.component.html',
  styleUrls: ['./repcontrato.component.css']

})

export class RepcontratoComponent implements OnInit {

    contratos: Contrato[];
    myTables: String;

  constructor(private router:Router, private contratoService:ContratoService){
   this.contratoService=contratoService;
   this.contratos=CONTRATOS;
  }


  ngOnInit() {
    this.contratoService.getContrato()
      .subscribe( data => {
        this.contratos = data;
        console.log("El registro es:"+ this.contratoService.getContrato());
        console.log("El dato es:"+CONTRATOS);
      });
    };

    @Input('app-repcontrato')
   columnName: string;

   @Input('ubicacionConsultor')
   ubicacionConsultor: string = '';

   @HostListener('click')
   sort() {
       this.ubicacionConsultor = this.ubicacionConsultor === 'asc' ? 'desc' : 'asc';
   }

    margins = {
                  top: 80,
                  bottom: 20,
                  left: 40,
                  width: 522
              };

    downloadPDF(){
      let source=document.getElementById("contrato");
      const doc=new jsPDF('landscape', 'pt','a1');
      doc.fromHTML(source,10,10,{
        'width': 595
      });
      doc.text(18, 18, '');
      doc.save('Contratos.pdf');
    }

       exportToExcel(event) {
         let blob =new Blob([document.getElementById('tab_contrato').innerHTML], {
            type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
        });
  this.contratoService.exportAsExcelFile(CONTRATOS, 'contratos');

}

}
