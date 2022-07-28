package com.ironhack.trailsservice.service.impl;

import com.ironhack.trailsservice.controller.dto.TrailDTO;
import com.ironhack.trailsservice.model.Trail;
import com.ironhack.trailsservice.repository.TrailRepository;
import com.ironhack.trailsservice.service.interfaces.TrailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TrailServiceImpl implements TrailService {


    @Autowired
    private TrailRepository trailRepository;

    public void delete(Long id) {
        Trail trail = trailRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Trail not found"));
        trailRepository.delete(trail);
    }


    public Trail updateTrail(Long id, TrailDTO trail) {
        Trail trailUpdated = trailRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trail not found."));
        trailUpdated.setUserId(trail.getUserId());
        trailUpdated.setName(trail.getName());
        trailUpdated.setDescription(trail.getDescription());
        trailUpdated.setDifficulty(trail.getDifficulty());
        trailUpdated.setLength(trail.getLength());
        trailUpdated.setAddress(trail.getAddress());
        trailUpdated.setRegion(trail.getRegion());
        trailUpdated.setLatitude(trail.getLatitude());
        trailUpdated.setLongitude(trail.getLongitude());
        trailUpdated.setImage(trail.getImage());

        return trailRepository.save(trailUpdated);
    }
    public Trail findTrailById(Long id) {
        Trail trail = trailRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trail not found."));
        return trail;
    }



}
