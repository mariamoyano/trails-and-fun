import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatToolbarModule } from '@angular/material/toolbar';
import { HomeComponent } from './components/home/home.component';
import { TrailsItemComponent } from './components/trails-item/trails-item.component';
import { PlacesItemComponent } from './components/places-item/places-item.component';
import { PlacesPageComponent } from './components/places-page/places-page.component';
import { TrailsPageComponent } from './components/trails-page/trails-page.component';
import { EventsPageComponent } from './components/events-page/events-page.component';
import { EventItemComponent } from './components/event-item/event-item.component';
import { EventFormComponent } from './components/event-form/event-form.component';
import { TrailsFormComponent } from './components/trails-form/trails-form.component';
import { PlacesFormComponent } from './components/places-form/places-form.component';
import { GoogleMapsModule } from '@angular/google-maps';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavBarComponent,
    HomeComponent,
    RegisterComponent,
    TrailsItemComponent,
    PlacesItemComponent,
    PlacesPageComponent,
    TrailsPageComponent,
    EventsPageComponent,
    EventItemComponent,
    EventFormComponent,
    TrailsFormComponent,
    PlacesFormComponent,
    
    
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatCardModule,
    MatButtonModule,
    MatInputModule,
    MatToolbarModule,
    GoogleMapsModule
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
