import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Trail } from 'src/app/models/trail.model';

@Component({
  selector: 'app-trails-item',
  templateUrl: './trails-item.component.html',
  styleUrls: ['./trails-item.component.css']
})
export class TrailsItemComponent implements OnInit {

  @Input()
  trail: Trail;


  @Input()
  index: number;

  @Output()
  removeTrailEvent: EventEmitter<number>; 

  constructor() { 
    this.trail = new Trail(0, 1, '', '', '', 0, '', '', 0, 0, '');
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
