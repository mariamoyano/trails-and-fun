import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlacesItemComponent } from './places-item.component';

describe('PlacesItemComponent', () => {
  let component: PlacesItemComponent;
  let fixture: ComponentFixture<PlacesItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlacesItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlacesItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
