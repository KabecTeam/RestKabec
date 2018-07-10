import { Component, OnInit } from '@angular/core';
import {ClienteService} from '../servicios/cliente.service';
import {Cliente} from '../modelos/cliente';
import {Router} from '@angular/router';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {
	private clientes: Cliente[];
  constructor(private _router:Router, private _servicioCLiente:ClienteService) { }

  ngOnInit() {

  	this._servicioCLiente.getAllClientes().subscribe(data=>{
			if (data.code != "200") {
				console.log(data);
				this.clientes = data;
			}

  	},
  	error=>{
  		console.log(error);
  	})
  }

}
