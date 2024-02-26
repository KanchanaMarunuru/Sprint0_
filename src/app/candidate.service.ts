import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
import { Candidate } from './candidate';

@Injectable({
  providedIn: 'root'
})
export class CandidateService {

  private baseURL = "http://localhost:8083/api/v1/candidate";

  constructor(private httpClient: HttpClient) { }
  public httpOptions = {
    headers: new HttpHeaders({
      'Access-Control-Allow-Origin':'*',
      'Authorization':'authkey'
    })
  }
  createCandidate(candidate: Candidate): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, candidate);
  }

  getCandidateList(): Observable<Candidate[]>{
    return this.httpClient.get<Candidate[]>(`${this.baseURL}`);
  }


}
