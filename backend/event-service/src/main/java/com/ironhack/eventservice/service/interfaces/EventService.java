package com.ironhack.eventservice.service.interfaces;

import com.ironhack.eventservice.controller.dto.EventDTO;
import com.ironhack.eventservice.model.Event;

public interface EventService {

    Event createEvent(Event event);
    Event updateEvent(Long id, EventDTO event);
}
