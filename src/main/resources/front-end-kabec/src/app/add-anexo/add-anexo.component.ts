import { Component, OnInit } from '@angular/core';
import {Anexo} from '../modelos/anexo';
import {PagosAnexosService} from '../servicios/pagos-anexos.service';
import {Router} from '@angular/router';
import {ClienteService} from '../servicios/cliente.service';
import {Cliente} from '../modelos/cliente';
@Component({
  selector: 'app-add-anexo',
  templateUrl: './add-anexo.component.html',
  styleUrls: ['./add-anexo.component.css']
})
export class AddAnexoComponent implements OnInit {
	anexo = new Anexo();
	anexos: Anexo[];

	clientes: Cliente[];
  constructor(private  _router: Router, private _servicio: PagosAnexosService, private  _clienteServicio: ClienteService) { }
	
  ngOnInit() {

  	this._clienteServicio.getAllClientes().subscribe(data=>{
			this.clientes = data;
  	},
    Error=>{
       console.log(Error);
    })
  }

  agregarAnexo(){

  	this._servicio.addAnexo(this.anexo).subscribe(data=>{
  		console.log(data);
    },
    Error => {
      console.log(Error);
    })
)
  }


}
