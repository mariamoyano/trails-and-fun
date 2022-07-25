import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Places } from '../models/places.model';

@Injectable({
  providedIn: 'root'
})
export class PlacesService {

  readonly API_URL = 'http://localhost:8080';

  constructor(
    private http: HttpClient
  ) { }

  getPlaces(): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places`);
  }
}
