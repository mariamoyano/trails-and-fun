package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.TrailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient("trails-service")
public interface TrailsClient {

    @GetMapping("/trails")
    List<TrailDTO> getTrails();

    @GetMapping("/trails/{id}")
    TrailDTO getTrail(Long id);

    @PostMapping("/trail/add")
    TrailDTO createTrail(TrailDTO trail);

    @PutMapping("/trail/edit/{id}")
    void updateTrail(Long id, TrailDTO trail);

    @DeleteMapping("/trail/delete/{id}")
    void deleteTrail(Long id);




}
