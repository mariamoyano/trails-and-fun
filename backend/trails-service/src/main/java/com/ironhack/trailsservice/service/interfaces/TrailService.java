package com.ironhack.trailsservice.service.interfaces;

import com.ironhack.trailsservice.model.Trail;

public interface TrailService {




    void delete(Long id);

    void update(Long id, Trail trails);
}
