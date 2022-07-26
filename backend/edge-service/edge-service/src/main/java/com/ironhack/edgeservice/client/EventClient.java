package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.EventDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("event-service")
public interface EventClient {


    @GetMapping("/events")
    List<EventDTO> getEvents();

    @GetMapping("/event/{id}")
    EventDTO getEvent(@PathVariable Long id);

    @PostMapping("/event/add")
    EventDTO createEvent(@RequestBody EventDTO event);

    @DeleteMapping("/event/delete/{id}")
    void deleteEvent(@PathVariable Long id);

    @PutMapping("/event/edit/{id}")
    EventDTO updateEvent(@PathVariable Long id, @RequestBody EventDTO event);


}
