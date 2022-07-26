import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Trail } from 'src/app/models/trail.model';

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

  


  constructor() {

    this.difficultyOptions = [ 'EASY', 'MODERATE', 'DIFFICULT' ];
    this.regionOptions = [ 'East', 'West', 'North', 'South' ];

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
  }

}
