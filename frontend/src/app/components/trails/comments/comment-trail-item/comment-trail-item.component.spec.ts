import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentTrailItemComponent } from './comment-trail-item.component';

describe('CommentTrailItemComponent', () => {
  let component: CommentTrailItemComponent;
  let fixture: ComponentFixture<CommentTrailItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentTrailItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CommentTrailItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
