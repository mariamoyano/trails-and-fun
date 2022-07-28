package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.CommentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("comment-service")
public interface CommentClient {

    @GetMapping("/comments")
    List<CommentDTO> getComments();


    @GetMapping("/comments/{id}")
    List<CommentDTO> getCommentsById(@PathVariable Long id);

    @GetMapping("/comments/{trailId}")
    List<CommentDTO> getCommentsByItemId(@PathVariable Long itemId);

    @PostMapping("/comment/add")
    CommentDTO createComment(@RequestBody CommentDTO comment);

    @DeleteMapping("/comment/delete/{id}")
    void deleteComment(@PathVariable Long id);

    @PutMapping("/comment/edit/{id}")
    void updateComment(@RequestBody CommentDTO comment);






}
