import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Persona} from '../modelos/persona';
import { Observable } from 'rxjs/Observable';
import { UrlConfigService } from '../url-config.service';

@Injectable({
  providedIn: 'root'
})
export class AsignacionService {

  constructor(private _http:HttpClient, private urlConfig: UrlConfigService) { }

	//private urlAreas = "http://localhost:8080/user-portal/";


	getAsignados(): Observable<any> {
		return this._http.get<Persona>(this.urlConfig + 'repPerAsig');
	}

	getNoAsignados(): Observable<any> {
		return this._http.get<Persona>(this.urlConfig + 'repPerNoAsig');
	}
}
