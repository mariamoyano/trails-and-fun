package com.ironhack.eventservice.repository;

import com.ironhack.eventservice.controller.dto.EventDTO;
import com.ironhack.eventservice.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findAll();

    Event save(Event event);

    Optional<Event> findById(Long id);

    void delete(Event event);

}
