import { Component, OnInit } from '@angular/core';
import {ServicioAreaService} from '../servicios/servicio-area.service';
import {Area} from '../modelos/area';
import {Router} from '@angular/router';
import {Form} from '@angular/forms';
import { ClienteService } from '../servicios/cliente.service';
import { Cliente } from '../modelos/cliente';
import { LayoutService } from 'angular-admin-lte';
@Component({
  selector: 'app-add-area',
  templateUrl: './add-area.component.html',
  styleUrls: ['./add-area.component.css']
})
export class AddAreaComponent implements OnInit {
	
	constructor(private _router: Router,private _areaServicio: ServicioAreaService, private _clienteService: ClienteService) { }
  public area= new Area();
  public clientes: Cliente[];
  
  ngOnInit() {

    this._clienteService.getAllClientes().subscribe(
      data => {
        console.log(data);
        this.clientes = data;
      },
      Error => {
        console.log(Error);
      })
  }

  createArea() {
  	this._areaServicio.createArea(this.area).subscribe(data=>{
  		console.log(data);

  	},
  	error=>{
  		console.log(error);
  	})
	};


}
 	