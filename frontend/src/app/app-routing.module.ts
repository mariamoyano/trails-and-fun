
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { AuthGuardService } from './services/auth-guard.service';
import { TrailsItemComponent } from './components/trails/trail/trails-item/trails-item.component';
import { PlacesItemComponent } from './components/places/places-form/places-item/places-item.component';
import { PlacesPageComponent } from './components/places/places-page/places-page.component';
import { TrailsPageComponent } from './components/trails/trail/trails-page/trails-page.component';
import { EventsPageComponent } from './components/events/events-page/events-page.component';
import { TrailsFormComponent } from './components/trails/trail/trails-form/trails-form.component';
import { PlacesFormComponent } from './components/places/places-form/places-form.component';
import { EventItemComponent } from './components/events/event-item/event-item.component';
import { EventFormComponent } from './components/events/event-form/event-form.component';
import { CommentTrailItemComponent } from './components/trails/comments/comment-trail-item/comment-trail-item.component';
import { ShowUsersComponent } from './components/show-users/show-users.component';


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
    path: 'trails/:id',
    component: TrailsItemComponent
  },
  {
    path: 'add-trail',
    component: TrailsFormComponent
  },
  {
    path: 'add-trail/:id',
    component: TrailsFormComponent
  },
  {
    path: 'places',
    component: PlacesPageComponent
  },

  {
    path: 'places/id',
    component: PlacesItemComponent
  },
  {
    path: 'add-place',
    component: PlacesFormComponent
  },
/*   {
    path: 'add-place/:id',
    component: PlacesFormComponent
  }, */
  {
    path: 'events',
    component: EventsPageComponent
  },
  {
    path: 'events/:id',
    component: EventItemComponent
  },
  {    path: 'add-event',
  component: EventFormComponent
},
  {
    path: 'add-event/:id',
    component: EventFormComponent
  },

  {
    path: 'comments/',
    component: CommentTrailItemComponent
  },
{
    path: 'comments/:id',
    component: CommentTrailItemComponent
  
},
/*   { path: 'users',
    component: ShowUsersComponent
  } */
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
