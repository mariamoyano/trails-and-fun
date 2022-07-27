package com.ironhack.commentservice.controller.impl;

import com.ironhack.commentservice.controller.interfaces.CommentController;
import com.ironhack.commentservice.model.TrailComment;
import com.ironhack.commentservice.repository.CommentRepository;
import com.ironhack.commentservice.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentControllerImpl implements CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/comments")
    @ResponseStatus(HttpStatus.OK)
    public List<TrailComment> findAll() {
        return commentRepository.findAll();
    }

    @GetMapping("/comments/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TrailComment findById(@PathVariable("id") Long id) {
        return commentRepository.findById(id).get();
    }






}
