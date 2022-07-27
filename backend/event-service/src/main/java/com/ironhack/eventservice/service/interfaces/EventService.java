package com.ironhack.eventservice.service.interfaces;

import com.ironhack.eventservice.model.Event;

public interface EventService {
    Event updateEvent(Long id, Event event);
}
