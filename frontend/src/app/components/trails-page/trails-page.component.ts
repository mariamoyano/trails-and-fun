import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user.model';
import { AuthService } from 'src/app/services/auth.service';
import { Trail } from 'src/app/models/trail.model';
import { ThisReceiver } from '@angular/compiler';

@Component({
  selector: 'app-trails-page',
  templateUrl: './trails-page.component.html',
  styleUrls: ['./trails-page.component.css'],
  
})
export class TrailsPageComponent implements OnInit {

  trail:Trail;
  trailsList: Trail[];

  
  constructor(
    private authService: AuthService,
    private router: Router
  ) { 
    this.trail=new Trail(0,0,"","","",0,"","",0,0,"");
    this.trailsList=[];
  }

  ngOnInit(): void {
      this.getTrails();
  }

  private getTrails(){
  this.authService.getTrails().subscribe(
    (trailsList:Trail[]) => {
      this.trailsList=trailsList;
    }
  )
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

  editTrail(index:number,trail: Trail): void {
    this.authService.updateTrail(index,this.trail).subscribe(
      (trail:Trail) => {
        this.trailsList[this.trailsList.indexOf(trail)]=trail;
      }
    )}
  }




  




