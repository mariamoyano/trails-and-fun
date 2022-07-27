import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Events } from 'src/app/models/events.model';
import { AuthService } from 'src/app/services/auth.service';
/* import { GoogleCalendarService } from 'src/app/services/google-calendar.service'; */

@Component({
  selector: 'app-event-form',
  templateUrl: './event-form.component.html',
  styleUrls: ['./event-form.component.css']
})
export class EventFormComponent implements OnInit {

  eventForm: FormGroup;

  type: string[];

  nameInput: FormControl;
  descriptionInput: FormControl;
  addressInput: FormControl;
  regionInput: FormControl;
  latitudeInput: FormControl;
  longitudeInput: FormControl;
  dateInput: FormControl;
  timeInput: FormControl;
  priceInput: FormControl;
  typeInput: FormControl;

  eventList!: Events[];

  

  
  constructor(
    private authService: AuthService,
    private router: Router,
  /*   private googleCalendarService: GoogleCalendarService */
  ) { 

    this.type = [ 'TRAIL', 'PLACE' ];
    this.nameInput = new FormControl('', [Validators.required]);
    this.descriptionInput = new FormControl('', [Validators.required]);
    this.addressInput = new FormControl('', [Validators.required]);
    this.regionInput = new FormControl('', [Validators.required]);
    this.latitudeInput = new FormControl('');
    this.longitudeInput = new FormControl('');
    this.dateInput = new FormControl('', [Validators.required]);
    this.timeInput = new FormControl('', [Validators.required]);
    this.priceInput = new FormControl('', [Validators.required]);
    this.typeInput = new FormControl('', [Validators.required]);


    this.eventForm = new FormGroup({
      name: this.nameInput,
      description: this.descriptionInput,
      address: this.addressInput,
      region: this.regionInput,
      latitude: this.latitudeInput,
      longitude: this.longitudeInput,
      date: this.dateInput,
      time: this.timeInput,
      price: this.priceInput,
      type: this.typeInput
    }, Validators.required);

  
  }

  ngOnInit(): void {
    
  }

  onSubmit() {
    console.log(this.eventForm.value);
    this.createEvent();
  }

  createEvent() {
    this.authService.createEvent(this.eventForm.value).subscribe(
      (response) => {
        console.log(response);
        this.router.navigate(['/events']);
      }
    )
  


  }
}
