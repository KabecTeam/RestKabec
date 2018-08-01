import { Component, OnInit } from '@angular/core';
import {ClienteService} from '../servicios/cliente.service';
import {Cliente} from '../modelos/cliente';
import {Router} from '@angular/router';
import { LayoutService } from 'angular-admin-lte';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {
	public clientes: Cliente[];
  constructor(private _router:Router, private _servicioCliente:ClienteService) { }

  ngOnInit() {

  	this._servicioCliente.getAllClientes().subscribe(data=>{
			if (data.code != "200") {
				console.log(data);
				this.clientes = data;
			}

  	},
  	error=>{
  		console.log(error);
  	})
  };

  deleteCliente(cliente: Cliente){
    this._servicioCliente.deleteCliente(cliente)
      .subscribe(data => {
        this.clientes = this.clientes.filter(u => u != cliente);
      })

  };

}
