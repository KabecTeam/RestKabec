import { Component, OnInit} from '@angular/core';
import { LayoutService } from 'angular-admin-lte';
import {IniSessionSreviceService} from '../servicios/ini-session-srevice.service';



@Component({
  selector: 'app-nuevoconsultor',
	templateUrl: './nuevoconsultor.component.html',


})

export class NuevoConsultor implements OnInit {
	ok: any;
	constructor(private _iniSession: IniSessionSreviceService) { }

	ngOnInit() {
		
		this._iniSession.Session().subscribe(data => {
			console.log(data);
			//window.location.href = 'http://192.168.0.32:8080/Kabec/nuevoConsultor';
			return 'ok';
		});
		
		
		
	}
}
