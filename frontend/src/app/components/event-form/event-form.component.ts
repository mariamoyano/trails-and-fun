import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Events } from 'src/app/models/events.model';
import { AuthService } from 'src/app/services/auth.service';
/* import { GoogleCalendarService } from 'src/app/services/google-calendar.service'; */

@Component({
  selector: 'app-event-form',
  templateUrl: './event-form.component.html',
  styleUrls: ['./event-form.component.css']
})
export class EventFormComponent implements OnInit {

  events: Events = new Events(0,0,"","","","",0,0,"","",0,"");
  id:number =  0;;

  eventForm: FormGroup;

  type: string[];
  regionOptions: string[];
  
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
    private activatedRoute:ActivatedRoute
  /*   private googleCalendarService: GoogleCalendarService */
  ) { 

    this.regionOptions = [ "ALAVA","ALBACETE","ALICANTE","ALMERIA","ASTURIAS","AVILA",
    "BADAJOZ","BARCELONA","BURGOS","CACERES","CADIZ","CANTABRIA","CASTELLON","CIUDAD_REAL","CORDOBA","LA_CORUÑA",
      "CUENCA","GERONA","GRANADA","GUADALAJARA","GUIPUZCUA","HUELVA","HUESCA","ISLAS_BALEARES","JAEN","LEON",
      "LERIDA","LUGO","MADRID","MALAGA","MELILLA","MURCIA","NAVARRA","OURENSE",
      "PALENCIA","ISLAS_CANARIAS","PONTEVEDRA","LA_RIOJA","SALAMANCA","SEGOVIA","SEVILLA","SORIA","TARRAGONA",
      "TERUEL","TOLEDO","VALENCIA","VALLADOLID","VIZCAYA","ZAMORA","ZARAGOZA" ];
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

  load(): void {
    this.activatedRoute.params.subscribe(params => {
      let id=params['id'];
      if(id){
        this.authService.getEventById(id).subscribe(
          data=>this.events=data
        );
      }

    }

  );
}



  onSubmit() {
    console.log(this.eventForm.value);
    if(this.id==0){
      this.createEvent();
    }
    
    this.update();
    
    
  }

  createEvent() {
    this.authService.createEvent(this.eventForm.value).subscribe(
      (response) => {
        console.log(response);
        this.router.navigate(['/events']);
      }
    )
  }

  /* addEventToCalendar() {
    this.googleCalendarService.addEventToCalendar(this.eventForm.value).subscribe(
      (response) => {
        console.log(response);
      }
    )
  } */


  delete(): void {
    this.activatedRoute.params.subscribe(params => {
      this.id=params['id'];
      this.authService.deleteEvent(this.id).subscribe(
        (response) => {
          console.log(response);
        }
      )
    });
  }

    update(){
      this.authService.updateEvent(this.id,this.eventForm.value).subscribe(
        (response) => {
          console.log(response);
          this.router.navigate(['/events']);
        });
        this.delete();
   
      }


   
   



}
