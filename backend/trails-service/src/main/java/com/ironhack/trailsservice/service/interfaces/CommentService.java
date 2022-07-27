package com.ironhack.trailsservice.service.interfaces;

import com.ironhack.trailsservice.controller.dto.CommentDTO;
import com.ironhack.trailsservice.model.Comment;

import java.util.List;

public interface CommentService {


    Comment createComment(Comment comment);

    void deleteComment(Long id);

    Comment updateComment(CommentDTO commentDTO);

    List<Comment> getByTrailId(Long id);

    List<Comment> getByUserId(Long id);



}
