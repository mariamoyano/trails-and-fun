import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Places } from 'src/app/models/places.model';
import { AuthService } from 'src/app/services/auth.service';
import { GoogleMapsService } from 'src/app/services/google-maps.service';

@Component({
  selector: 'app-places-item',
  templateUrl: './places-item.component.html',
  styleUrls: ['./places-item.component.css']
})
export class PlacesItemComponent implements OnInit {

  


    place:Places;
    placesList: Places[];
    display : any;
    center: google.maps.LatLngLiteral = {lat: 40.4165, lng: -3.70256};
    centerList: google.maps.LatLngLiteral[];
    zoom = 14;
  
    
    constructor(
      private authService: AuthService,
      private router: Router,
      private googleMapsService: GoogleMapsService
    ) { 
      this.place=new Places(0,0,"","","","","",0,0,"");
      this.placesList=[];
      this.centerList=[];
    }
  
    ngOnInit(): void {
      this.getAllPlaces();
    }
  
    getLocation(){
      this.placesList.forEach(element => {
        this.center = {lat: element.latitude, lng: element.longitude}
        this.centerList.push(this.center);
      });
  
    }
    getAllPlaces(){
      this.authService.getPlaces().subscribe(
        data  => {this.placesList = data;
          console.log(data);
          
         },
        
        error => {
          console.log(error);
        });
        
    }
  
  
    addPlace(): void {
      
      this.authService.createPlace(this.place).subscribe(
        (place:Places) => {
          this.placesList.push(place);
        }
      )
    }
  
  
  
    removePlace(index: number): void {
      this.authService.deletePlace(index).subscribe(
        data => {
          console.log(data);
          this.getAllPlaces();
        }
      );
    }
  
   
    }
