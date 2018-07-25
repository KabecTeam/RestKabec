import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AsignacionService } from '../servicios/asignacion.service';
import { Persona } from '../modelos/persona';
import { LayoutService } from 'angular-admin-lte';
@Component({
  selector: 'app-noasignados',
  templateUrl: './noasignados.component.html',
  styleUrls: ['./noasignados.component.css']
})
export class NoasignadosComponent implements OnInit {
	noasignados: Persona[];
  constructor(private _router: Router, private _servico: AsignacionService) { }

  ngOnInit() {

  	this._servico.getNoAsignados().subscribe(data=>{
  			  this.noasignados = data;
  		  },Error=>{
  		  	console.log(Error);
  		  })
  }

}
