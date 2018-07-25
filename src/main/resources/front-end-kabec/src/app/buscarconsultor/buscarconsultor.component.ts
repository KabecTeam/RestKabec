import { Component, OnInit} from '@angular/core';
import { LayoutService } from 'angular-admin-lte';



@Component({
  selector: 'app-buscarconsultor',
	templateUrl: './buscarconsultor.component.html',

})

export class BuscarConsultor implements OnInit {

	constructor() { }

	ngOnInit() {
		window.location.href = 'http://192.168.0.32:8080/Kabec/buscarConsultor'
	}
}
