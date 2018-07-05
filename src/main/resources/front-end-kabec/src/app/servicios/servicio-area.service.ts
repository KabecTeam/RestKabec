import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable({
  providedIn: 'root'
})
export class ServicioAreaService {

  constructor(private _httpCliente: HttpClient) { 
  }

  getAll():Observable<any>{
	  return this._httpCliente.get('//localhost:8080/ShowAreas');
  }
}
