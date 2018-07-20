import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Complemento } from '../models/complemento.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class ComplementoService {

  constructor(private http:HttpClient) {}

  private complementoUrl = 'http://localhost:8080/user-portal/complemento';

  public getComplemento() {
    return this.http.get<Complemento[]>(this.complementoUrl);
  }

  public deleteComplemento(complemento) {
    return this.http.delete(this.complementoUrl + "/"+ complemento.empComplemento);
  }

  public createComplemento(complemento) {
    return this.http.post<Complemento>(this.complementoUrl, complemento);
  }

}
