import { Component, OnInit } from '@angular/core';
import { PagosAnexosService } from '../servicios/pagos-anexos.service';
import {PagosAnexos} from '../modelos/pagos-anexos';
import {Router} from '@angular/router';
import {Anexo} from '../modelos/anexo';
import { RegistroAsignacion } from '../modelos/registro-asignacion';
@Component({
  selector: 'app-pagos-anexo',
  templateUrl: './pagos-anexo.component.html',
  styleUrls: ['./pagos-anexo.component.css']
})
export class PagosAnexoComponent implements OnInit {
	pagoAnexo = new PagosAnexos();
	anexos: Anexo[];
	anexo: any;
	personasXAnexo: any[];
	registros: RegistroAsignacion[];
	registro: any;
	

	constructor(private _router: Router, private _servicioAnexo: PagosAnexosService) { }

  ngOnInit() {
	  
	  this._servicioAnexo.getAllAnexos().subscribe(data => {
		  this.anexos = data;
		  console.log(data);
	  },
		  Error => {
			  console.log(Error);
		  });

	  this._servicioAnexo.getAllRegistros().subscribe(data=>{
	  	this.registros=data;
		  
		  
	  	console.log(data);
	  },Error=>{
	  	console.log(Error);
	  })

	  let i: number = 1;
	  for (this.anexo in this.anexos) {
		  for (this.registro in this.registros) {
			  if (this.anexo.idanexo == this.registro.idanexo) {
				  this.personasXAnexo[i] = this.registro;
				  console.log(this.personasXAnexo[i]);
				  i = i + 1;

			  }
		  }
	  }

  }

  pagoDeAnexo(){
	this.pagoAnexo.periodo = 1;
  	this._servicioAnexo.pagarAnexo(this.pagoAnexo).subscribe(data=>{
  		console.log(this.pagoAnexo);
  		console.log(data);

	}, Error => {
  		console.log(Error);
  	})
  }

}
