package com.ironhack.commentservice.controller.impl;

import com.ironhack.commentservice.controller.dto.CommentDTO;
import com.ironhack.commentservice.controller.interfaces.CommentController;
import com.ironhack.commentservice.model.Comment;

import com.ironhack.commentservice.repository.CommentRepository;
import com.ironhack.commentservice.service.interfaces.CommentService;
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

        @GetMapping("/comments")
        @ResponseStatus(HttpStatus.OK)
        public List<Comment> findAll() {
            return commentRepository.findAll();
        }

        @GetMapping("/comment/{id}")
        @ResponseStatus(HttpStatus.OK)
        public Comment findCommentById(@PathVariable(name = "id") Long id) {
            return commentRepository.findById(id).get();
        }


        @GetMapping("/comments/{itemId}")
        @ResponseStatus(HttpStatus.OK)
        public List<Comment> findByItemId(@PathVariable("itemId") Long itemId) {
            return commentRepository.findByItemId(itemId);
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
