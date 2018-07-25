import { Component, OnInit} from '@angular/core';
import { LayoutService } from 'angular-admin-lte';



@Component({
  selector: 'app-nuevousuario',
  templateUrl: './nuevousuario.component.html',

})

export class NuevoUsuario implements OnInit {

	constructor() { }

	ngOnInit() {
		window.location.href='http://192.168.0.32:8080/Kabec/altaUsuario'
	}
}
