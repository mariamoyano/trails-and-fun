package com.ironhack.trailsservice.controller.interfaces;


import com.ironhack.trailsservice.controller.dto.CommentDTO;
import com.ironhack.trailsservice.model.Comment;

public interface CommentController {


        Comment createComment(Comment comment);

        void deleteComment(Long id);

        void updateComment(CommentDTO comment);





}
