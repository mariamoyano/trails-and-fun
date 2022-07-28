package com.ironhack.commentservice.service.impl;



import com.ironhack.commentservice.controller.dto.CommentDTO;
import com.ironhack.commentservice.model.Comment;
import com.ironhack.commentservice.repository.CommentRepository;
import com.ironhack.commentservice.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public Comment updateComment(CommentDTO commentDTO) {
        Comment comment = commentRepository.findById(commentDTO.getId()).get();
        comment.setComment(commentDTO.getComment());
        return commentRepository.save(comment);


    }

    @Override
    public List<Comment> getByItemId(Long id) {
        return commentRepository.findByItemId(id);
    }

    @Override
    public List<Comment> getByUserId(Long id) {
        return commentRepository.findByUserId(id);
    }
}
