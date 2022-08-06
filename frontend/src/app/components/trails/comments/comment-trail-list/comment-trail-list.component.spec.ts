import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentTrailListComponent } from './comment-trail-list.component';

describe('CommentTrailListComponent', () => {
  let component: CommentTrailListComponent;
  let fixture: ComponentFixture<CommentTrailListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentTrailListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CommentTrailListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
