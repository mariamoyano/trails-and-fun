import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrailsItemComponent } from './trails-item.component';

describe('TrailsItemComponent', () => {
  let component: TrailsItemComponent;
  let fixture: ComponentFixture<TrailsItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrailsItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrailsItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
