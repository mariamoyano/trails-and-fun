package com.ironhack.trailsservice.controller.interfaces;

import com.ironhack.trailsservice.model.Trail;

import java.util.List;

public interface TrailControllerInterface {

    List<Trail> findAll();
    Trail create(Trail trail);
    void update(Long id, Trail trail);
    void delete(Long id);





}
