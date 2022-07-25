import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trails-page',
  templateUrl: './trails-page.component.html',
  styleUrls: ['./trails-page.component.css']
})
export class TrailsPageComponent implements OnInit {

  trailList: Trails[];
  
  userId: number,
  name: string,
  description: string,
  difficulty: string,
  length: number,
  address: string,
  location: string,


  constructor() { }

  ngOnInit(): void {
  }

}
