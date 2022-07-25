package com.ironhack.trailsservice.service.interfaces;

import com.ironhack.trailsservice.model.Trails;

import java.util.List;

public interface TrailsService {




    void delete(Long id);

    void update(Long id, Trails trails);
}
