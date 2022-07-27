import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GoogleMapsService {

  private API_URL = 'https://www.googleapis.com/maps/api/geocode/json';

  constructor(
    private http: HttpClient
  ) { }
  
  public getAddress(lat: number, lng: number) {
    return this.http.get(`${this.API_URL}?latlng=${lat},${lng}`);
  }


}
