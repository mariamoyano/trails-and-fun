import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentTrailFormComponent } from './comment-trail-form.component';

describe('CommentTrailFormComponent', () => {
  let component: CommentTrailFormComponent;
  let fixture: ComponentFixture<CommentTrailFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentTrailFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CommentTrailFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
