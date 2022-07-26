import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Trail } from 'src/app/models/trail.model';
import { AuthService } from 'src/app/services/auth.service';


@Component({
  selector: 'app-trails-item',
  templateUrl: './trails-item.component.html',
  styleUrls: ['./trails-item.component.css']
})
export class TrailsItemComponent implements OnInit {

  trail:Trail;
  trailsList!: Trail[];

  
  constructor(
    private authService: AuthService,
    private router: Router
  ) { 
    this.trail=new Trail(0,0,"","","",0,"","",0,0,"");
    this.trailsList=[];
  }

  ngOnInit(): void {
    this.getAllTrails();

  }
  
  getAllTrails(){
    this.authService.getTrails().subscribe(
      data  => {this.trailsList = data;
        console.log(data);
       },
      
      error => {
        console.log(error);
      });
    
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
