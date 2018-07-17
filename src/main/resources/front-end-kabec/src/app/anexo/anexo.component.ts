import { Component, OnInit } from '@angular/core';
import { Anexo } from '../modelos/anexo';
import { PagosAnexosService } from '../servicios/pagos-anexos.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-anexo',
  templateUrl: './anexo.component.html',
  styleUrls: ['./anexo.component.css']
})
export class AnexoComponent implements OnInit {

	anexos: Anexo[];
  constructor(private _router:Router, private _servicio: PagosAnexosService) { }

  ngOnInit() {

  	this._servicio.getAllAnexos().subscribe(data=>{
			this.anexos = data;
			console.log(data);
  	},Error=>{
  		console.log(Error);
  	})
  	
  }

 

}
