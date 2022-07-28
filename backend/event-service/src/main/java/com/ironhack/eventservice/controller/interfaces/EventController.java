package com.ironhack.eventservice.controller.interfaces;

import com.ironhack.eventservice.controller.dto.EventDTO;
import com.ironhack.eventservice.model.Event;

import java.util.List;

public interface EventController {


    Event findEventById(Long id);
    Event  createEvent(Event event);
    void deleteEvent(Long id);
    Event updateEvent(Long id, EventDTO event);

    List<Event> findAll();










}
