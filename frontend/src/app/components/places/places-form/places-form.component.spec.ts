import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlacesFormComponent } from './places-form.component';

describe('PlacesFormComponent', () => {
  let component: PlacesFormComponent;
  let fixture: ComponentFixture<PlacesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlacesFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlacesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
