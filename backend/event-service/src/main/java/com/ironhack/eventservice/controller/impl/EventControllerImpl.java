package com.ironhack.eventservice.controller.impl;

import com.ironhack.eventservice.controller.interfaces.EventController;
import com.ironhack.eventservice.model.Event;
import com.ironhack.eventservice.repository.EventRepository;
import com.ironhack.eventservice.service.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventControllerImpl implements EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/events")
    @ResponseStatus(HttpStatus.OK)
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @GetMapping("/events/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Event findEventById(@PathVariable(name = "id") Long id) {
        return eventRepository.findById(id).get();
    }

    @PostMapping("/event/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @DeleteMapping("/event/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEvent(@PathVariable(name = "id") Long id) {
        eventRepository.deleteById(id);
    }
    @PutMapping("/event/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Event updateEvent(@PathVariable(name = "id") Long id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

}
