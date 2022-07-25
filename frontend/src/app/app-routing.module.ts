
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { AuthGuardService } from './services/auth-guard.service';
import { TrailsItemComponent } from './components/trails-item/trails-item.component';
import { PlacesItemComponent } from './components/places-item/places-item.component';
import { PlacesPageComponent } from './components/places-page/places-page.component';
import { TrailsPageComponent } from './components/trails-page/trails-page.component';
import { EventsPageComponent } from './components/events-page/events-page.component';

const routes: Routes = [
  {
    path: '',
    canActivate: [AuthGuardService],
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'trails',
    component: TrailsPageComponent
  },
  {
    path: 'places',
    component: PlacesPageComponent
  },
  {
    path: 'events',
    component: EventsPageComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
