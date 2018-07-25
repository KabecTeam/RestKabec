import { Component, OnInit } from '@angular/core';
import { Form } from '@angular/forms';
import { ClienteService } from '../servicios/cliente.service';
import { Cliente } from '../modelos/cliente';
import {Router} from '@angular/router';
import { LayoutService } from 'angular-admin-lte';

@Component({
  selector: 'app-d-cliente',
  templateUrl: './d-cliente.component.html',
  styleUrls: ['./d-cliente.component.css']
})
export class DClienteComponent implements OnInit {
	cliente = new Cliente();
	constructor(private _router: Router,private _clienteService: ClienteService) { }

  ngOnInit() {
  }

	createCliente() {
		this._clienteService.addCliente(this.cliente).subscribe(data => {
			console.log(data);

		},
			error => {
				console.log(error);
			})
	};

}
