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

    this.categoryOptions =   ["AQUATIC","CLIMBING", "SNOW", "GAMES", "PICNIC", "CAMPING","MIX","OTHER"];
    this.regionOptions = [ "ALAVA","ALBACETE","ALICANTE","ALMERIA","ASTURIAS","AVILA",
    "BADAJOZ","BARCELONA","BURGOS","CACERES","CADIZ","CANTABRIA","CASTELLON","CIUDAD_REAL","CORDOBA","LA_CORUÑA",
      "CUENCA","GERONA","GRANADA","GUADALAJARA","GUIPUZCUA","HUELVA","HUESCA","ISLAS_BALEARES","JAEN","LEON",
      "LERIDA","LUGO","MADRID","MALAGA","MELILLA","MURCIA","NAVARRA","OURENSE",
      "PALENCIA","ISLAS_CANARIAS","PONTEVEDRA","LA_RIOJA","SALAMANCA","SEGOVIA","SEVILLA","SORIA","TARRAGONA",
      "TERUEL","TOLEDO","VALENCIA","VALLADOLID","VIZCAYA","ZAMORA","ZARAGOZA" ];

    this.nameInput = new FormControl('', [Validators.required]);
    this.descriptionInput = new FormControl('', [Validators.required]);
    this.categoryInput = new FormControl('', [Validators.required]);
    this.addressInput = new FormControl('');
    this.regionInput = new FormControl('', [Validators.required]);
    this.latitudeInput = new FormControl('');
    this.longitudeInput = new FormControl('');
    this.imageInput = new FormControl('', [Validators.required]);

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
    console.log(this.placeForm.value);
    this.addPlace();
  }

  addPlace(): void {
    
    this.authService.createPlace(this.placeForm.value).subscribe(
      (response) => {
        console.log(response);  
        this.router.navigate(['/places']);
      }
    )
  }

}

