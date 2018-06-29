import {Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {Area} from '../modelos/area';

@Injectable({
  providedIn: 'root'
})
export class AreaService {
	private baseUrl: String= 'http://localhost:8080';
	private headers = new Headers({'Content-Type':'application/json'});
	private options = new RequestOptions({headers:this.headers});
  
	constructor(private _http: Http) { }
  	
	getAreas(){

			return this._http.get(this.baseUrl+ '/ShowAreas', this.options).map((response:Response)=>response.json())
  		.catch(this.errorHandler);
  	}

  	public getArea(id){

			return this._http.get(this.baseUrl +'/findArea?idArea=' + id, this.options).map((response: Response) => response.json())
  		.catch(this.errorHandler);
  	};

  	public deleteArea(id){

  		return this._http.delete(this.baseUrl+'/delArea?idArea='+id,this.options).map((response:Response)=>response.json())
  		.catch(this.errorHandler);
  	}

  	public addArea(area:Area){

  		return this._http.post(this.baseUrl+'/addArea',JSON.stringify(area),this.options).map((response:Response)=>response.json())

  		.catch(this.errorHandler);
  	}

  	public updateArea(area:Area){

  		return this._http.put(this.baseUrl+'/addArea',JSON.stringify(area),this.options).map((response:Response)=>response.json())

  		.catch(this.errorHandler);
  	};


  	errorHandler(error:Response){

  		return Observable.throw(error||"Server Error");

  	}

 
}
