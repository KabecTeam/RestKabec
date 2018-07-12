import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpResponse} from '@angular/common/http';
import {PagosAnexos} from '../modelos/pagos-anexos';
import {Observable} from 'rxjs/Observable';
import {Anexo} from '../modelos/anexo';

const httpOptions = {
	headers: new HttpHeaders({ "Content-Type": "Application/Json" })

};

@Injectable({
  providedIn: 'root'
})
export class PagosAnexosService {

  constructor(private _http: HttpClient) { }
	
	private urlReportePagos = "http://localhost:8080/user-portal/";

	getReport(): Observable<any> {
		return this._http.get<PagosAnexos>(this.urlReportePagos + 'showPagosAnexos');
	}

	getAllAnexos():Observable<any>{
		return this._http.get<PagosAnexos>(this.urlReportePagos + 'showAnexos');
	}

	addAnexo(anexo: Anexo){
		return this._http.post(this.urlReportePagos + 'addAnexo', anexo, httpOptions);
	}	

	pagarAnexo(pagoAnexo: PagosAnexos ){
		return this._http.post(this.urlReportePagos + 'addPagoAnexo', pagoAnexo, httpOptions);
	}
}
