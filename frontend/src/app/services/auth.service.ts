import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';
import { Places } from '../models/places.model';
import { Trail } from '../models/trail.model';
import { Events } from '../models/events.model';
import { Comment } from '../models/comment.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  
  readonly API_URL = 'http://localhost:8080';

  constructor(
    private http: HttpClient
  ) { }

  isAuthenticated(): boolean {
    const token: string | null = localStorage.getItem('currentUser');
    return token !== null;
  }

  register(username: string, password: string): Observable<User> {

    const user: User = new User(
      null,
      username,
      password,
      []
    );

    return this.http.post<User>(`${this.API_URL}/users`, user);
          
  }

  login(username: string, password: string): Observable<User> {
    let headers = new HttpHeaders();
    headers = headers.append('Authorization', 'Basic ' + btoa(`${username}:${password}`));

    return this.http.get<User>(`${this.API_URL}/login`, { headers: headers });
        
}

logout(): void {
    // Remove user from local storage to log user out
    localStorage.removeItem('currentUser');
}


getPlaces(): Observable<Places[]> {
  return this.http.get<Places[]>(`${this.API_URL}/places`);
}
getPlace(id: number): Observable<Places> {
  return this.http.get<Places>(`${this.API_URL}/places/${id}`);
}
createPlace(place: Places): Observable<Places> {
  return this.http.post<Places>(`${this.API_URL}/place/add`, place);
}
updatePlace(id: number, place: Places): Observable<Places> {
  return this.http.put<Places>(`${this.API_URL}/place/edit/${id}`, place);
}
deletePlace(id: number): Observable<Places> {
  return this.http.delete<Places>(`${this.API_URL}/place/delete/${id}`);
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

getTrails(): Observable<Trail[]> {
  return this.http.get<Trail[]>(`${this.API_URL}/trails`);
}

getTrail(id: number): Observable<Trail> {
  return this.http.get<Trail>(`${this.API_URL}/trails/${id}`);
}
createTrail(trail: Trail): Observable<Trail> {
  return this.http.post<Trail>(`${this.API_URL}/trail/add`, trail);
}

updateTrail(id: number, trail: Trail): Observable<Trail> {
  return this.http.put<Trail>(`${this.API_URL}/trail/edit/${id}`, trail);

}

deleteTrail(id: number): Observable<Trail> {
  return this.http.delete<Trail>(`${this.API_URL}/trail/delete/${id}`);
}

getEvents(): Observable<Events[]> {
  return this.http.get<Events[]>(`${this.API_URL}/events`);
}
createEvent(events: Events): Observable<Events> {
  return this.http.post<Events>(`${this.API_URL}/event/add`, events);
}
updateEvent(id: number, events: Events): Observable<Events> {
  return this.http.put<Events>(`${this.API_URL}/event/edit/${id}`, events);
}
deleteEvent(id: number): Observable<Events> {
  return this.http.delete<Events>(`${this.API_URL}/event/delete/${id}`);
}

getEventById(id: number): Observable<Events> {
  return this.http.get<Events>(`${this.API_URL}/event/${id}`);
}

getComments(): Observable<Comment[]> {
  return this.http.get<Comment[]>(`${this.API_URL}/comments`);
  
}

createComment(comment: Comment): Observable<Comment> {
  return this.http.post<Comment>(`${this.API_URL}/comment/add`, comment);
}
updateComment(id: number, comment: Comment): Observable<Comment> {
  return this.http.put<Comment>(`${this.API_URL}/comment/edit/${id}`, comment);
}
deleteComment(id: number): Observable<Comment> {
  return this.http.delete<Comment>(`${this.API_URL}/comment/delete/${id}`);
}
}