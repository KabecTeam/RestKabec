import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlConfigService } from '../url-config.service';

import { User } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserService {

  constructor(private http:HttpClient, private urlConfig:UrlConfigService) {}

  //private userUrl = 'http://localhost:8080/user-portal/api';
  //rivate userUrl = '/api';

  public getUsers() {
    return this.http.get<User[]>(this.urlConfig+'api');
  }

  public deleteUser(user) {
    return this.http.delete(this.urlConfig+'api' + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.urlConfig+'api', user);
  }

}
