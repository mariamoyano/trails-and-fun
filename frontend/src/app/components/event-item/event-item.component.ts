import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Events } from 'src/app/models/events.model';
import { AuthService } from 'src/app/services/auth.service';



@Component({
  selector: 'app-event-item',
  templateUrl: './event-item.component.html',
  styleUrls: ['./event-item.component.css']
})
export class EventItemComponent implements OnInit {

  events: Events;
  eventsList: Events[];
  
  constructor(
    private authService: AuthService,
    private router: Router
  ) { 
    this.events=new Events(0,0,"","","","",0,0,"","",0,"");
    this.eventsList=[];
 
  } 

  ngOnInit(): void {
    this.getEvents();
  }

  getEvents(): void {

    this.authService.getEvents().subscribe(
      data  => {this.eventsList = data;
        console.log(data);

      },
        
      error => {
        console.log(error);
      });
      
      
  }

  onClick(events: Events): void {
    this.router.navigate(['/event', events.id]);
  }

  deleteEvent(index:number): void {
    this.authService.deleteEvent(index).subscribe(
      data => {
        console.log(data);
        this.getEvents();
      }
    );
  }

  onClickEdit(events: Events): void {
    this.router.navigate(['/add-event', events.id]);
  } 

  updateEvent(index:number,events: Events): void {
    this.authService.updateEvent(index,events).subscribe(
      data => {
        console.log(data);
        this.getEvents();
      }
    );
  } 




}
