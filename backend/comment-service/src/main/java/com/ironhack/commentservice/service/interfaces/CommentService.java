package com.ironhack.commentservice.service.interfaces;

import com.ironhack.commentservice.controller.dto.CommentDTO;
import com.ironhack.commentservice.model.Comment;

import java.util.List;

public interface CommentService {


    Comment createComment(Comment comment);

    void deleteComment(Long id);

    Comment updateComment(CommentDTO commentDTO);

    List<Comment> getByItemId(Long itemId);

    List<Comment> getByUserId(Long userId);



}
