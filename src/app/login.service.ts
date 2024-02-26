import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private baseURL = "http://localhost:8083/api/v1/login";

  constructor(private httpClient: HttpClient) { }
  public httpOptions = {
    headers: new HttpHeaders({
      'Access-Control-Allow-Origin':'*',
      'Authorization':'authkey'
    })
  }

  createUser(user: User): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, user);
  }

  getAllUsersByUsername(username): Observable<Object>{
    return this.httpClient.get<User[]>(`${this.baseURL+"/username/"+username}`,this.httpOptions);
  }
}
