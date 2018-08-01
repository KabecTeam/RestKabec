import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpResponse} from '@angular/common/http';
import {PagosAnexos} from '../modelos/pagos-anexos';
import {Observable} from 'rxjs/Observable';
import {Anexo} from '../modelos/anexo';
import {RegistroAsignacion} from '../modelos/registro-asignacion';
import { UrlConfigService } from '../url-config.service';


const httpOptions = {
	headers: new HttpHeaders({ "Content-Type": "Application/Json" })

};

@Injectable({
  providedIn: 'root'
})
export class PagosAnexosService {

  constructor(private _http: HttpClient, private urlConfig: UrlConfigService) { }
	
	//private urlReportePagos = "http://localhost:8080/user-portal/";

	getReport(): Observable<any> {
		return this._http.get<PagosAnexos>(this.urlConfig + 'showPagosAnexos');
	}

	getAllAnexos():Observable<any>{
		return this._http.get<PagosAnexos>(this.urlConfig + 'showAnexos');
	}

	addAnexo(anexo: Anexo){
		return this._http.post(this.urlConfig + 'addAnexo', anexo, httpOptions);
	}	

	pagarAnexo(pagoAnexo: PagosAnexos ){
		return this._http.post(this.urlConfig + 'addPagoAnexo', pagoAnexo, httpOptions);
	}

	getAllRegistros():Observable<any>{
		return this._http.get<RegistroAsignacion>(this.urlConfig + 'Asignacion');
	}

	deleteanexo(anexo:Anexo){
		return this._http.delete(this.urlConfig + 'delAnexo?idAnexo=' + anexo.idanexo)
	}
}
