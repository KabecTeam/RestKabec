import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders,HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {Area} from '../modelos/area';
import { UrlConfigService } from '../url-config.service';

const httpOptions = {
	headers: new HttpHeaders({ "Content-Type": "Application/Json" })

};

@Injectable({
  providedIn: 'root'
})
export class ServicioAreaService {

  constructor(private _httpCliente: HttpClient, private urlConfig:UrlConfigService) { }

	//private urlAreas = "http://localhost:8080/user-portal/area/";



  getAll():Observable<any>{
	  return this._httpCliente.get<Area>(this.urlConfig+'ShowAreas');
  }

  deleteArea(area: Area){
	  return this._httpCliente.delete(this.urlConfig + 'delArea?idArea=' + area.idArea);

	};

	createArea(area:Area){
		return this._httpCliente.post(this.urlConfig + 'addArea', area, httpOptions);
	}

}
