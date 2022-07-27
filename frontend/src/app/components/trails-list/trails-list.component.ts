import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Trail } from 'src/app/models/trail.model';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-trails-list',
  templateUrl: './trails-list.component.html',
  styleUrls: ['./trails-list.component.css']
})
export class TrailsListComponent implements OnInit {

  
  trail:Trail;
  trailsList!: Trail[];
  display : any;
  center: google.maps.LatLngLiteral = {lat: 40.4165, lng: -3.70256};
  centerList: google.maps.LatLngLiteral[];
  zoom = 14;
  
  constructor(
    private authService: AuthService,
    private router: Router
  ) { 
    this.trail=new Trail(0,0,"","","",0,"","",0,0,"");
    this.trailsList=[];
    this.centerList=[];
   
  }

  ngOnInit(): void {
    this.getAllTrails();
    
    
  }
  getLocation(){
    this.trailsList.forEach(element => {
      this.center = {lat: element.latitude, lng: element.longitude}
      this.centerList.push(this.center);
    });

  }
  getAllTrails(){
    this.authService.getTrails().subscribe(
      data  => {this.trailsList = data;
        console.log(data);
        
       },
      
      error => {
        console.log(error);
      });
      this.getLocation();
  }



  addTrail(): void {
    
    this.authService.createTrail(this.trail).subscribe(
      (trail:Trail) => {
        this.trailsList.push(trail);

      }
    )
  }



  removeTrail(index: number): void {
    
    this.trailsList.splice(index, 1);
    this.authService.deleteTrail(index).subscribe();
  }

  editTrail(trail: Trail): void {

  }
  }
