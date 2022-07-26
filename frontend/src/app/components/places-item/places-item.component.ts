import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Places } from 'src/app/models/places.model';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-places-item',
  templateUrl: './places-item.component.html',
  styleUrls: ['./places-item.component.css']
})
export class PlacesItemComponent implements OnInit {

  


    place:Places;
    placesList: Places[];
  
    
    constructor(
      private authService: AuthService,
      private router: Router
    ) { 
      this.place=new Places(0,0,"","","","","",0,0,"");
      this.placesList=[];
    }
  
    ngOnInit(): void {
      this.authService.getPlaces().subscribe(
        Data => {this.placesList = Data}
      )
    }
  
  
  
  
    addPlace(): void {
      
      this.authService.createPlace(this.place).subscribe(
        (place:Places) => {
          this.placesList.push(place);
        }
      )
    }
  
  
  
    removeTrail(index: number): void {
      
      this.placesList.splice(index, 1);
      this.authService.deleteTrail(index).subscribe();
    }
  
    editTrail(place: Places): void {
  
    }
    }
