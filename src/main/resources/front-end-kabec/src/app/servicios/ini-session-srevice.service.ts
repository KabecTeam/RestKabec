import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Cliente } from '../modelos/cliente';
import { Observable } from 'rxjs/Observable';
import { LayoutService } from 'angular-admin-lte';
import {User} from '../models/user.model';
const httpOptions = {
	headers: new HttpHeaders({ 'Content-Type': 'Application/x-www-form-urlencoded' })

};

const field = { usename: 'bryan' ,password: 'sasa'};
@Injectable({
  providedIn: 'root'
})
export class IniSessionSreviceService {
	private userinput = new FormData();
	constructor(private _http: HttpClient) { }

	private url = "http://192.168.0.10:8080/logincheck";
	

	getFormUrlEncoded(toConvert) {
		const formBody = [];
		for (const property in toConvert) {
			const encodedKey = encodeURIComponent(property);
			const encodedValue = encodeURIComponent(toConvert[property]);
			formBody.push(encodedKey + '=' + encodedValue);
		}
		return formBody.join('&');
	}

	Session() {
		this.userinput.append('username','bryan');
		this.userinput.append('password','sasa')
		console.log(this.userinput);
		return this._http.post(this.url, this.getFormUrlEncoded(field));
	}
}
