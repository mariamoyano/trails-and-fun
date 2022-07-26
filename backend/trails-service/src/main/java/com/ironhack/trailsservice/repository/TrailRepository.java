package com.ironhack.trailsservice.repository;

import com.ironhack.trailsservice.controller.impl.TrailControllerImpl;
import com.ironhack.trailsservice.model.Trail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrailRepository extends JpaRepository<Trail, Long> {

    List<Trail> findAll();

    Trail save(Trail trails);

    Optional<Trail> findById(Long id);


    void delete(Trail trail);
}

