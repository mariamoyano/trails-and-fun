package com.ironhack.trailsservice.service.impl;

import com.ironhack.trailsservice.model.Trails;
import com.ironhack.trailsservice.repository.TrailsRepository;
import com.ironhack.trailsservice.service.interfaces.TrailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TrailsServiceImpl implements TrailsService {


    @Autowired
    private TrailsRepository trailsRepository;

    public void delete(Long id) {
        Trails trails = trailsRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Trail not found"));
        trailsRepository.delete(trails);
    }


    public void update(Long id, Trails trails) {
        Trails trail = trailsRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id " + id + " not found."));

        trailsRepository.save(trails);

    }

}
