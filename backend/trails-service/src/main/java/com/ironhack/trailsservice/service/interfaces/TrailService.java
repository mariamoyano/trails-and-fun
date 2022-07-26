package com.ironhack.trailsservice.service.interfaces;

import com.ironhack.trailsservice.controller.dto.TrailDTO;
import com.ironhack.trailsservice.model.Trail;

public interface TrailService {




    void delete(Long id);

    void update(Long id, TrailDTO trails);

    Trail save(Trail trail);
}
