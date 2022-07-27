import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GoogleCalendarService {

  private API_URL = 'https://www.googleapis.com/calendar/v3/calendars/';

  constructor(
    private http: HttpClient
  ) { }
    
  public getEvents(calendarId: string, startDate: string, endDate: string) {
    return this.http.get(`${this.API_URL}${calendarId}/events?timeMin=${startDate}&timeMax=${endDate}`);
  }


  public createEvent(calendarId: string, event: any) {
    return this.http.post(`${this.API_URL}${calendarId}/events`, event);
  }


  public deleteEvent(calendarId: string, eventId: string) {
    return this.http.delete(`${this.API_URL}${calendarId}/events/${eventId}`);
  }

}
