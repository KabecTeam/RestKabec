import { Component, OnInit } from '@angular/core';
import { PagosAnexosService } from '../servicios/pagos-anexos.service';
import {PagosAnexos} from '../modelos/pagos-anexos';
import {Router} from '@angular/router';
import {Anexo} from '../modelos/anexo';
@Component({
  selector: 'app-pagos-anexo',
  templateUrl: './pagos-anexo.component.html',
  styleUrls: ['./pagos-anexo.component.css']
})
export class PagosAnexoComponent implements OnInit {
	pagoAnexo = new PagosAnexos();
	anexos: Anexo[];
	constructor(private _router: Router, private _servicioAnexo: PagosAnexosService) { }

  ngOnInit() {
  	this._servicioAnexo.getAllAnexos().subscribe(data=>{
			this.anexos = data;
			console.log(data);
  	},
  	Error=>{
  		console.log(Error);
  	})

  }

  pagoDeAnexo(){
  	this._servicioAnexo.pagarAnexo(this.pagoAnexo).subscribe(data=>{
  		console.log(data);
  	},
  	Error=>{
  		console.log(Error);
  	})
  }

}
