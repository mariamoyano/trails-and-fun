import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlacesPageComponent } from './places-page.component';

describe('PlacesPageComponent', () => {
  let component: PlacesPageComponent;
  let fixture: ComponentFixture<PlacesPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlacesPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlacesPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
