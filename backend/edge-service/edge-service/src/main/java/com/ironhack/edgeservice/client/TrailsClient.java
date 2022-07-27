package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.CommentDTO;
import com.ironhack.edgeservice.controller.dto.TrailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("trails-service")
public interface TrailsClient {

    @GetMapping("/trails")
    List<TrailDTO> getTrails();

    @GetMapping("/trails/{id}")
    TrailDTO getTrail(@PathVariable Long id);

    @PostMapping("/trail/add")
    TrailDTO createTrail(@RequestBody TrailDTO trail);

    @PutMapping("/trail/edit/{id}")
    void updateTrail(@PathVariable Long id, @RequestBody TrailDTO trail);

    @DeleteMapping("/trail/delete/{id}")
    void deleteTrail(@PathVariable Long id);

    @GetMapping("/comments/trails")
    List<CommentDTO> getComments();


    @GetMapping("/comments/trails/{id}")
    List<CommentDTO> getCommentsById(@PathVariable Long id);

    @GetMapping("/comments/trail/{trailId}")
    List<CommentDTO> getCommentsByTrailId(@PathVariable Long trailId);

    @PostMapping("/comment/add")
    CommentDTO createComment(@RequestBody CommentDTO comment);

    @DeleteMapping("/comment/delete/{id}")
    void deleteComment(@PathVariable Long id);

    @PutMapping("/comment/edit/{id}")
    void updateComment(@RequestBody CommentDTO comment);




}
