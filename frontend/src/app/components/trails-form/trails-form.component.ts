import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Trail } from 'src/app/models/trail.model';
import { AuthService } from 'src/app/services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-trails-form',
  templateUrl: './trails-form.component.html',
  styleUrls: ['./trails-form.component.css']
})
export class TrailsFormComponent implements OnInit {

  difficultyOptions: string[];
  regionOptions: string[];


  trailForm! : FormGroup;
  nameInput: FormControl;
  descriptionInput: FormControl;
  difficultyInput: FormControl;
  lengthInput: FormControl;
  addressInput: FormControl;
  regionInput: FormControl;
  latitudeInput: FormControl;
  longitudeInput: FormControl;
  imageInput: FormControl;

  trailsList!: Trail[];
  


  constructor(    private authService: AuthService,
    private router: Router) {

    this.difficultyOptions = [ 'EASY', 'MODERATE', 'DIFFICULT' ];
    this.regionOptions = [ 'MADRID', 'BARCELONA', 'SEVILLA', 'MALAGA' ];

    this.nameInput = new FormControl('');
    this.descriptionInput = new FormControl('');
    this.difficultyInput = new FormControl('');
    this.lengthInput = new FormControl('');
    this.addressInput = new FormControl('');
    this.regionInput = new FormControl('');
    this.latitudeInput = new FormControl('');
    this.longitudeInput = new FormControl('');
    this.imageInput = new FormControl('');

    this.trailForm = new FormGroup({
      name: this.nameInput,
      description: this.descriptionInput,
      difficulty: this.difficultyInput,
      length: this.lengthInput,
      address: this.addressInput,
      region: this.regionInput,
      latitude: this.latitudeInput,
      longitude: this.longitudeInput,
      image: this.imageInput
    }, Validators.required);

  }
  

  ngOnInit(): void {

  
  }

  onSubmit(): void {
    console.log('Form submitted');
    const trail: Trail = this.trailForm.value;
    console.log(trail);
    this.addTrail(trail);
  }

  addTrail(trail:Trail): void {
    
    this.authService.createTrail(trail).subscribe(
      (trail:Trail) => {
        this.trailsList.push(trail);

      }
    )
  }

}
