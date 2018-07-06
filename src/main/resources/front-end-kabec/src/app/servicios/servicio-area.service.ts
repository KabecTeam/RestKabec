import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {Area} from '../modelos/area';

const httpOptions = {
	headers: new HttpHeaders({ "Content-Type": "Application/Json" })

};

@Injectable({
  providedIn: 'root'
})
export class ServicioAreaService {

  constructor(private _httpCliente: HttpClient) { 
  }

	private urlAreas = 'http://localhost:8080/user-portal/'

  getAll():Observable<any>{
	  return this._httpCliente.get(this.urlAreas+'ShowAreas');
  }
}
