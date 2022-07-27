package com.ironhack.trailsservice.controller.impl;


import com.ironhack.trailsservice.controller.dto.CommentDTO;
import com.ironhack.trailsservice.controller.interfaces.CommentController;
import com.ironhack.trailsservice.model.Comment;
import com.ironhack.trailsservice.repository.CommentRepository;
import com.ironhack.trailsservice.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentControllerImpl implements CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/comments/trails")
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @GetMapping("/comments/trails/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Comment findCommentById(@PathVariable(name = "id") Long id) {
        return commentRepository.findById(id).get();
    }


    @GetMapping("/comments/trail/{trailId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findByTrailId(@PathVariable("trailId") Long trailId) {
        return commentRepository.findByTrailId(trailId);
    }

    @PostMapping("/comment/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }



    @DeleteMapping("/comment/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable(name = "id") Long id) {
        commentRepository.deleteById(id);
    }

    @PutMapping("/comment/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateComment(CommentDTO comment) {
        commentService.updateComment(comment);
    }



}
