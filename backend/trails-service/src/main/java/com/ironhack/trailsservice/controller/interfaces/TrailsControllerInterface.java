package com.ironhack.trailsservice.controller.interfaces;

import com.ironhack.trailsservice.model.Trails;

import java.util.List;
import java.util.Optional;

public interface TrailsControllerInterface {

    List<Trails> findAll();
    Trails create(Trails trails);
    void update(Long id, Trails trails);
    void delete(Long id);





}
