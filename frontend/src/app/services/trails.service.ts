import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Trails } from '../models/trails.model';
@Injectable({
  providedIn: 'root'
})
export class TrailsService {
  readonly API_URL = 'http://localhost:8080';

  constructor(
    private http: HttpClient
  ) { }

  getTrails(): Observable<Trails[]> {
    return this.http.get<Trails[]>(`${this.API_URL}/trails`);
  }
  


}
