import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrailsFormComponent } from './trails-form.component';

describe('TrailsFormComponent', () => {
  let component: TrailsFormComponent;
  let fixture: ComponentFixture<TrailsFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrailsFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrailsFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
