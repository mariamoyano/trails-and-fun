package com.ironhack.eventservice.controller.interfaces;

import com.ironhack.eventservice.model.Event;

public interface EventController {
    Event        createEvent(Event event);
    void deleteEvent(Long id);
    Event updateEvent(Long id, Event event);









}
