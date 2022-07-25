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
  getPlace(id: number): Observable<Places> {
    return this.http.get<Places>(`${this.API_URL}/places/${id}`);
  }
  createPlace(place: Places): Observable<Places> {
    return this.http.post<Places>(`${this.API_URL}/places/add`, place);
  }
  updatePlace(id: number, place: Places): Observable<Places> {
    return this.http.put<Places>(`${this.API_URL}/place/edit${id}`, place);
  }
  deletePlace(id: number): Observable<Places> {
    return this.http.delete<Places>(`${this.API_URL}/place/delete${id}`);
  }
  getPlacesByUser(userId: number): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places/user/${userId}`);
  }
  getPlacesByCategory(category: string): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places/category/${category}`);
  }
  getPlacesByName(name: string): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places/name/${name}`);
  }
  getPlacesByCity(region: string): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places/region/${region}`);
  }
  getPlacesByAddress(address: string): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places/address/${address}`);
  }

  getPlacesByLatLng(lat: number, lng: number): Observable<Places[]> {
    return this.http.get<Places[]>(`${this.API_URL}/places/latlng/${lat}/${lng}`);
  }


}
