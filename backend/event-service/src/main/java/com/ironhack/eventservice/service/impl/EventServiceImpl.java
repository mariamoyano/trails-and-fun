package com.ironhack.eventservice.service.impl;

import com.ironhack.eventservice.model.Event;
import com.ironhack.eventservice.repository.EventRepository;
import com.ironhack.eventservice.service.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event updateEvent(Long id, Event event) {
        Event eventToUpdate = eventRepository.findById(id).get();
        eventToUpdate.setName(event.getName());
        eventToUpdate.setDescription(event.getDescription());
        eventToUpdate.setAddress(event.getAddress());
        eventToUpdate.setLatitude(event.getLatitude());
        eventToUpdate.setLongitude(event.getLongitude());
        eventToUpdate.setImage(event.getImage());
        return eventRepository.save(eventToUpdate);

    }
}
