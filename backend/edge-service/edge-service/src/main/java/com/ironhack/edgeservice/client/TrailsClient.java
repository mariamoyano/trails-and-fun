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






}
