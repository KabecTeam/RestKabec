import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Cliente } from '../modelos/cliente';
import { Observable } from 'rxjs/Observable';
import { LayoutService } from 'angular-admin-lte';
import {User} from '../models/user.model';
const httpOptions = {
	headers: new HttpHeaders({ 'Content-Type': 'Application/x-www-form-urlencoded' })

};
@Injectable({
  providedIn: 'root'
})
export class IniSessionSreviceService {
	constructor(private _http: HttpClient) { }
	
}
