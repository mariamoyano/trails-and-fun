import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { GoogleCalendarService } from 'src/app/services/google-calendar.service';
@Component({
  selector: 'app-event-form',
  templateUrl: './event-form.component.html',
  styleUrls: ['./event-form.component.css']
})
export class EventFormComponent implements OnInit {

  eventForm: FormGroup;
  dateInput: FormControl;
  descriptionInput: FormControl;  

  
  constructor(
    private authService: AuthService,
    private router: Router,
    private googleCalendarService: GoogleCalendarService
  ) { 
    this.dateInput = new FormControl('', [Validators.required]);
    this.descriptionInput = new FormControl('', [Validators.required]);
    this.eventForm = new FormGroup({
      date: this.dateInput,
      description: this.descriptionInput
  });
  }

  ngOnInit(): void {
    
  }

  createEvent() {
/* 
    this.googleCalendarService.createEvent() */


  }
}
