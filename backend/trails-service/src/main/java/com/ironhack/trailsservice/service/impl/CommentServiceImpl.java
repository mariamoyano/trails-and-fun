package com.ironhack.trailsservice.service.impl;




import com.ironhack.trailsservice.controller.dto.CommentDTO;
import com.ironhack.trailsservice.model.Comment;
import com.ironhack.trailsservice.model.Trail;
import com.ironhack.trailsservice.repository.CommentRepository;
import com.ironhack.trailsservice.service.interfaces.CommentService;
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
        comment.setText(commentDTO.getText());
        return commentRepository.save(comment);


    }


    @Override
    public List<Comment> getByUserId(Long id) {
        return commentRepository.findByUserId(id);
    }


}
