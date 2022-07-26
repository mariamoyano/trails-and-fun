import { Component, Input, OnInit } from '@angular/core';
import { Trail } from 'src/app/models/trail.model';

@Component({
  selector: 'app-trails-page',
  templateUrl: './trails-page.component.html',
  styleUrls: ['./trails-page.component.css']
})
export class TrailsPageComponent implements OnInit {

  @Input()
  trailList!: Trail[];

  
  constructor() { }

  ngOnInit(): void {
  }


  addTrail(trail: Trail): void {
    console.log('add...' + trail.name);
    this.trailList.push(trail);
  }

  removeTrail(index: number): void {
    console.log('delete trail...' + index);
    this.trailList.splice(index, 1);
  }

  editTrail(trail: Trail): void {
    console.log('edit trail...' + trail.name);
  }



  




}
