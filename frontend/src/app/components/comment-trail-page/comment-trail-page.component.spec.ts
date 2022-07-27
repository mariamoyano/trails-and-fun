import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentTrailPageComponent } from './comment-trail-page.component';

describe('CommentTrailPageComponent', () => {
  let component: CommentTrailPageComponent;
  let fixture: ComponentFixture<CommentTrailPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentTrailPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CommentTrailPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
