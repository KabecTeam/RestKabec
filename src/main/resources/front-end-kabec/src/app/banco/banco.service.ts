import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Banco } from '../models/banco.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class BancoService {

  constructor(private http:HttpClient) {}

  private bancoUrl = 'http://localhost:8080/user-portal/banco';

  public getBanco() {
    return this.http.get<Banco[]>(this.bancoUrl);
  }

  public deleteBanco(banco) {
    return this.http.delete(this.bancoUrl + "/"+ banco.idBanco);
  }

  public createBanco(banco) {
    return this.http.post<Banco>(this.bancoUrl, banco);
  }

}
