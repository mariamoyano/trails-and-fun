import { Component, OnInit } from '@angular/core';
import { ViewChild } from '@angular/core';
import { GoogleMap, MapInfoWindow, MapMarker } from '@angular/google-maps';
import { Router } from '@angular/router';
import { Events } from 'src/app/models/events.model';
import { AuthService } from 'src/app/services/auth.service';
import { EventItemComponent } from '../event-item/event-item.component';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  events: Events;
  eventsList: Events[];
  longitudeList:number[];
  latitudeList:number[];
  
  constructor(
    private authService: AuthService,
    private router: Router
  ) { 
    this.events=new Events(0,0,"","","","",0,0,"","",0,"");
    this.eventsList=[];
    this.longitudeList= []  
    this.latitudeList= []
 
  } 

  title = 'frontend';
  @ViewChild('myGoogleMap', { static: false })
  map!: GoogleMap;
  @ViewChild(MapInfoWindow, { static: false })
  info!: MapInfoWindow;

  zoom = 12;
  maxZoom = 15;
  minZoom = 8;
  center!: google.maps.LatLngLiteral;
  options: google.maps.MapOptions = {
    zoomControl: false,
    scrollwheel: false,
    disableDoubleClickZoom: true,
    mapTypeId: 'hybrid',
    maxZoom:this.maxZoom,
    minZoom:this.minZoom,
  }
  markers = []  as  any;
  infoContent = ''

  ngOnInit() {

    
    navigator.geolocation.getCurrentPosition((position) => {
      this.center = {
        lat: position.coords.latitude,
        lng: position.coords.longitude,
      }
    })
    this.eventsList= EventItemComponent.getEvents();
    this.getLongitude(this.eventsList);
    this.getLatitude(this.eventsList);
    this.markerByLatLngList(this.latitudeList,this.longitudeList);
  }

  zoomIn() {
    if (this.zoom < this.maxZoom) this.zoom++;
    console.log('Get Zoom',this.map.getZoom());
  }

  zoomOut() {
    if (this.zoom > this.minZoom) this.zoom--;
  }

  eventHandler(event: any ,name:string){
    console.log(event,name);
    
/*     // Add marker on double click event
    if(name === 'mapDblclick'){
      this.dropMarker(event)
    } */
  }

  // Markers
  logCenter() {
    console.log(JSON.stringify(this.map.getCenter()))
  }

/*   dropMarker(event:any) {
    this.markers.push({
      position: {
        lat: event.latLng.lat(),
        lng: event.latLng.lng(),
      },
      label: {
        color: 'blue',
        text: 'Marker label ' + (this.markers.length + 1),
      },
      title: 'Marker title ' + (this.markers.length + 1),
      info: 'Marker info ' + (this.markers.length + 1),
      options: {
        animation: google.maps.Animation.DROP,
      },
    })
  } */

  openInfo(marker: MapMarker, content: string) {
    this.infoContent = content;
    this.info.open(marker)
  }

  getLongitude(event:any){
    this.eventsList.forEach(element => {
      this.longitudeList.push(element.longitude);
    }
    )
    console.log(this.longitudeList);

  }
  getLatitude(event:any){
    this.eventsList.forEach(element => {
      this.latitudeList.push(element.latitude);
    }
    )
    console.log(this.latitudeList);

  }

  markerByLatLng(lat:number,lng:number){
    this.markers.push({
      position: {
        lat: lat,
        lng: lng,
      },
      label: {
        color: 'blue',
        text: 'Marker label ' + (this.markers.length + 1),
      },
      title: 'Marker title ' + (this.markers.length + 1),
      info: 'Marker info ' + (this.markers.length + 1),
      options: {
        animation: google.maps.Animation.DROP,
      },
    })
  }

  markerByLatLngList(lat:number[],lng:number[]){

    for(let i=0;i<lat.length;i++){
      this.markers.push({
        position: {
          lat: lat[i],
          lng: lng[i],
        },
        label: {
          color: 'blue',
          text: 'Marker label ' + (this.markers.length + 1),
        },
        title: 'Marker title ' + (this.markers.length + 1),
        info: 'Marker info ' + (this.markers.length + 1),
        options: {
          animation: google.maps.Animation.DROP,
        },
      })
    }
  }

  






  



}
