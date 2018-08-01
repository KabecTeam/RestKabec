import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders,HttpResponse } from '@angular/common/http';
import {Cliente} from '../modelos/cliente';
import {Observable} from 'rxjs/Observable';
import { LayoutService } from 'angular-admin-lte';
import { UrlConfigService } from '../url-config.service';

const httpOptions = {
	headers: new HttpHeaders({ "Content-Type": "Application/Json" })

};

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private _http:HttpClient, private urlConfig:UrlConfigService) { }

	//private urlAreas = "http://localhost:8080/user-portal/";

	getAllClientes():Observable<any>{
		return this._http.get<Cliente>(this.urlConfig + 'ShowClientes');
	}

	deleteCliente(cliente:Cliente){
		return this._http.delete(this.urlConfig + 'deleteCliente?idCliente=' + cliente.idCliente);
	}

	addCliente(cliente:Cliente){
		return this._http.post(this.urlConfig + 'addCliente', cliente, httpOptions);
	}
}
