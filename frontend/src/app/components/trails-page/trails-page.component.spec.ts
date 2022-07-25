import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrailsPageComponent } from './trails-page.component';

describe('TrailsPageComponent', () => {
  let component: TrailsPageComponent;
  let fixture: ComponentFixture<TrailsPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrailsPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrailsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
