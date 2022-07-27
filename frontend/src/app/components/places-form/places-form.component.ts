import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { Router } from '@angular/router';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Places } from 'src/app/models/places.model';
@Component({
  selector: 'app-places-form',
  templateUrl: './places-form.component.html',
  styleUrls: ['./places-form.component.css']
})
export class PlacesFormComponent implements OnInit {

  categoryOptions: string[];
  regionOptions: string[];


  placeForm! : FormGroup;
  nameInput: FormControl;
  descriptionInput: FormControl;
  categoryInput: FormControl;
  addressInput: FormControl;
  regionInput: FormControl;
  latitudeInput: FormControl;
  longitudeInput: FormControl;
  imageInput: FormControl;

  placesList!: Places[];
  


  constructor(    private authService: AuthService,
    private router: Router) {

    this.categoryOptions = [ ];
    this.regionOptions = [ ];

    this.nameInput = new FormControl('');
    this.descriptionInput = new FormControl('');
    this.categoryInput = new FormControl('');
    this.addressInput = new FormControl('');
    this.regionInput = new FormControl('');
    this.latitudeInput = new FormControl('');
    this.longitudeInput = new FormControl('');
    this.imageInput = new FormControl('');

    this.placeForm = new FormGroup({
      name: this.nameInput,
      description: this.descriptionInput,
      category: this.categoryInput,
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
    const place: Places = this.placeForm.value;
    console.log(place);
    this.addPlace(place);
  }

  addPlace(place:Places): void {
    
    this.authService.createPlace(place).subscribe(
      (place:Places) => {
        this.placesList.push(place);

      }
    )
  }

}

