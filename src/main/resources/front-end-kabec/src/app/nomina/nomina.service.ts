import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Nomina } from '../models/nomina.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class NominaService {

  constructor(private http:HttpClient) {}

  private nominaUrl = 'http://localhost:8080/user-portal/nomina';

  public getNomina() {
    return this.http.get<Nomina[]>(this.nominaUrl);
  }

  public deleteNomina(nomina) {
    return this.http.delete(this.nominaUrl + "/"+ nomina.contratoNomina);
  }

  public createNomina(nomina) {
    return this.http.post<Nomina>(this.nominaUrl, nomina);
  }

}
