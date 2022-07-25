import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Trails } from 'src/app/models/trails.model';

@Component({
  selector: 'app-trails-item',
  templateUrl: './trails-item.component.html',
  styleUrls: ['./trails-item.component.css']
})
export class TrailsItemComponent implements OnInit {

  @Input()
  trail: Trails;


  @Input()
  index: number;

  @Output()
  removeTrailEvent: EventEmitter<number>; 

  constructor() { 
    this.trail = new Trails(0,0,"","","",0,"","","");
    this.index = 0;
    this.removeTrailEvent = new EventEmitter<number>();
  }

  ngOnInit(): void {
  }

  removeTrail(): void {
    console.log('eliminando trail...' + this.index);

    this.removeTrailEvent.emit(this.index); 
  }

}
