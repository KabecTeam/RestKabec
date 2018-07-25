import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders,HttpResponse } from '@angular/common/http';
import {Resolve} from '@angular/router';
import {Observable} from 'rxjs/Observable';



@Injectable({
  providedIn: 'root'
})
export class redService implements Resolve<any> {
	resolve(){
		window.location.href = '192.168.0.32:8080';
		return false;
	}

}
