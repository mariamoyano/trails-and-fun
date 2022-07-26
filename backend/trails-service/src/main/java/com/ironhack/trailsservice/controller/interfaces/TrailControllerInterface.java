package com.ironhack.trailsservice.controller.interfaces;

import com.ironhack.trailsservice.controller.dto.TrailDTO;
import com.ironhack.trailsservice.model.Trail;

import java.util.List;

public interface TrailControllerInterface {

    List<Trail> findAll();
    Trail create(Trail trail);
    void update(Long id, TrailDTO trail);
    void delete(Long id);





}
