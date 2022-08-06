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
import { TrailsItemComponent } from './components/trails/trail/trails-item/trails-item.component';
import { PlacesItemComponent } from './components/places/places-form/places-item/places-item.component';
import { PlacesPageComponent } from './components/places/places-page/places-page.component';
import { TrailsPageComponent } from './components/trails/trail/trails-page/trails-page.component';
import { EventsPageComponent } from './components/events/events-page/events-page.component';
import { EventItemComponent } from './components/events/event-item/event-item.component';
import { EventFormComponent } from './components/events/event-form/event-form.component';
import { TrailsFormComponent } from './components/trails/trail/trails-form/trails-form.component';
import { PlacesFormComponent } from './components/places/places-form/places-form.component';
import { GoogleMapsModule } from '@angular/google-maps';
import { MapComponent } from './components/events/map/map.component';
import { MatGridListModule } from '@angular/material/grid-list';
import { CommentTrailListComponent } from './components/trails/comments/comment-trail-list/comment-trail-list.component';
import { CommentTrailItemComponent } from './components/trails/comments/comment-trail-item/comment-trail-item.component';
import { CommentTrailPageComponent } from './components/trails/comments/comment-trail-page/comment-trail-page.component';
import { CommentTrailFormComponent } from './components/trails/comments/comment-trail-form/comment-trail-form.component';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatRadioModule } from '@angular/material/radio';
import { ShowUsersComponent } from './components/show-users/show-users.component';



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

     ShowUsersComponent,
 
    
    
 
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
