import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders,HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {Area} from '../modelos/area';

const httpOptions = {
	headers: new HttpHeaders({ "Content-Type": "Application/Json" })

};

@Injectable({
  providedIn: 'root'
})
export class ServicioAreaService {

  constructor(private _httpCliente: HttpClient) { }

	private urlAreas = "http://localhost:8080/user-portal/area/";



  getAll():Observable<any>{
	  return this._httpCliente.get<Area>(this.urlAreas+'ShowAreas');
  }

  deleteArea(area: Area){
  	return this._httpCliente.delete(this.urlAreas+'delArea?idArea='+area.idArea)

	};

	createArea(area:Area){
		return this._httpCliente.post(this.urlAreas+'addArea',area,httpOptions)
	}

}
