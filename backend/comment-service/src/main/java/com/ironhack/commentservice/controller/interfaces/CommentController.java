package com.ironhack.commentservice.controller.interfaces;


import com.ironhack.commentservice.controller.dto.CommentDTO;
import com.ironhack.commentservice.model.Comment;

public interface CommentController {


        Comment createComment(Comment comment);

        void deleteComment(Long id);

        void updateComment(CommentDTO comment);





}
