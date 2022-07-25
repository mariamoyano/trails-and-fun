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
  
  getTrail(id: number): Observable<Trails> {
    return this.http.get<Trails>(`${this.API_URL}/trails/${id}`);
  }
  createTrail(trail: Trails): Observable<Trails> {
    return this.http.post<Trails>(`${this.API_URL}/trail/add`, trail);
  }

  updateTrail(id: number, trail: Trails): Observable<Trails> {
    return this.http.put<Trails>(`${this.API_URL}/trail/edit/${id}`, trail);

  }

  deleteTrail(id: number): Observable<Trails> {
    return this.http.delete<Trails>(`${this.API_URL}/trail/delete/${id}`);
  }

}
