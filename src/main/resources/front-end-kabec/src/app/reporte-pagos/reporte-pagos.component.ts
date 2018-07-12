import { Component, OnInit } from '@angular/core';
import {PagosAnexosService} from '../servicios/pagos-anexos.service';
import {Router} from '@angular/router';
import {PagosAnexos} from '../modelos/pagos-anexos';

@Component({
  selector: 'app-reporte-pagos',
  templateUrl: './reporte-pagos.component.html',
  styleUrls: ['./reporte-pagos.component.css']
})
export class ReportePagosComponent implements OnInit {
	pagosAnexos: PagosAnexos[];
  constructor(private _router:Router, private _servicePagoAnexo: PagosAnexosService) { }

  ngOnInit() {

	  this._servicePagoAnexo.getReport().subscribe(data=>{
		  this.pagosAnexos = data;

		  
		  console.log(data);
	  })
  }

}
