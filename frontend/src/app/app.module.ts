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
import { MapComponent } from './components/map/map.component';
import { MatGridListModule } from '@angular/material/grid-list';
import { CommentTrailListComponent } from './components/comment-trail-list/comment-trail-list.component';
import { CommentTrailItemComponent } from './components/comment-trail-item/comment-trail-item.component';
import { CommentTrailPageComponent } from './components/comment-trail-page/comment-trail-page.component';
import { CommentTrailFormComponent } from './components/comment-trail-form/comment-trail-form.component';
import { TrailsListComponent } from './components/trails-list/trails-list.component';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatRadioModule } from '@angular/material/radio';
import { EventEditComponent } from './components/event-edit/event-edit.component';



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
    MapComponent,
    CommentTrailListComponent,
    CommentTrailItemComponent,
    CommentTrailPageComponent,
    CommentTrailFormComponent,

    TrailsListComponent,
     EventEditComponent,
    
    
 
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
    GoogleMapsModule,
    MatGridListModule,
    MatFormFieldModule,
    MatListModule,
    MatIconModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatCheckboxModule,
    MatRadioModule
   
    
    


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
