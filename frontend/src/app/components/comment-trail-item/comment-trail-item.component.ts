import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Comment } from 'src/app/models/comment.model';
import { AuthService } from 'src/app/services/auth.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-comment-trail-item',
  templateUrl: './comment-trail-item.component.html',
  styleUrls: ['./comment-trail-item.component.css']
})
export class CommentTrailItemComponent implements OnInit {


  comments: Comment;
  commentList: Comment[];
  commentForm: FormGroup;
  commentInput: FormControl;



  id:number =  0;
  
  constructor(
    private authService: AuthService,
    private router: Router
  ) { 
    this.comments=new Comment(0,0,0,"");
    this.commentList=[];

    this.commentInput = new FormControl('', [Validators.required]);
    this.commentForm = new FormGroup({
      comment: this.commentInput
    }, Validators.required);
  }

  ngOnInit(): void {
    this.getComment();
  }

  getComment(): void {
    this.authService.getComments().subscribe(
      data  => {this.commentList = data;
        console.log(data);

      },

      error => {
        console.log(error);
      }
    );

      
      
  }

  deleteComment(index:number): void {
    this.authService.deleteComment(index).subscribe(
      data => {
        console.log(data);
        this.getComment();
      }
    );
  }

  onSubmit() {
    this.authService.createComment(this.commentForm.value.comment).subscribe(
      data => {
        console.log(data);
        this.getComment();
      }
    );
  }

}
