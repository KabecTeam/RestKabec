import { Component, OnInit } from '@angular/core';
import { LayoutService } from 'angular-admin-lte';



@Component({
	selector: 'app-consultarusuario',
	templateUrl: './consultarusuario.component.html',

})

export class ConsultarUsuario implements OnInit {

	constructor() { }

	ngOnInit() {

		window.location.href = 'http://192.168.0.32:8080/Kabec/consultarUsuario'

	}
}
