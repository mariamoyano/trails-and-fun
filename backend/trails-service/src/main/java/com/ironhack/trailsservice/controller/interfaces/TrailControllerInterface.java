package com.ironhack.trailsservice.controller.interfaces;

import com.ironhack.trailsservice.controller.dto.TrailDTO;
import com.ironhack.trailsservice.model.Trail;

import java.util.List;

public interface TrailControllerInterface {

    List<Trail> findAll();
    Trail createTrail(Trail trail);

    Trail findTrailById(Long id);
    Trail updatePlace(Long id, TrailDTO trail);
    void deleteTrail(Long id);





}
