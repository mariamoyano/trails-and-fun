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

    this.nameInput = new FormControl('', [Validators.required]);
    this.descriptionInput = new FormControl('', [Validators.required]);
    this.difficultyInput = new FormControl('', [Validators.required]);
    this.lengthInput = new FormControl('', [Validators.required]);
    this.addressInput = new FormControl('', [Validators.required]);
    this.regionInput = new FormControl('', [Validators.required]);
    this.latitudeInput = new FormControl('', [Validators.required]);
    this.longitudeInput = new FormControl('', [Validators.required]);
    this.imageInput = new FormControl('', [Validators.required]);

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
