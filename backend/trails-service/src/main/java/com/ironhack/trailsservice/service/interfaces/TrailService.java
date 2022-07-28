package com.ironhack.trailsservice.service.interfaces;

import com.ironhack.trailsservice.controller.dto.TrailDTO;
import com.ironhack.trailsservice.model.Trail;

public interface TrailService {


    void delete(Long id);



    Trail findTrailById(Long id);

    Trail updateTrail(Long id, TrailDTO trail);
}
