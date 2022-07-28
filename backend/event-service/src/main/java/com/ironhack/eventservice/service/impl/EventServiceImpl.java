package com.ironhack.eventservice.service.impl;

import com.ironhack.eventservice.controller.dto.EventDTO;
import com.ironhack.eventservice.model.Event;
import com.ironhack.eventservice.repository.EventRepository;
import com.ironhack.eventservice.service.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event updateEvent(Long id, EventDTO event) {
        Event eventToUpdate = eventRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found"));
        eventToUpdate.setUserId(event.getUserId());
        eventToUpdate.setName(event.getName());
        eventToUpdate.setDescription(event.getDescription());
        eventToUpdate.setAddress(event.getAddress());
        eventToUpdate.setRegion(event.getRegion());
        eventToUpdate.setLatitude(event.getLatitude());
        eventToUpdate.setLongitude(event.getLongitude());
        eventToUpdate.setDate(event.getDate());
        eventToUpdate.setTime(event.getTime());
        eventToUpdate.setPrice(event.getPrice());
        eventToUpdate.setType(event.getType());
        return eventRepository.save(eventToUpdate);

    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
}
