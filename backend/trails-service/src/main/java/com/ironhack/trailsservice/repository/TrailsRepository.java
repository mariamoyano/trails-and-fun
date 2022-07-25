package com.ironhack.trailsservice.repository;

import com.ironhack.trailsservice.model.Trails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrailsRepository extends JpaRepository<Trails, Long> {

    List<Trails> findAll();

    Trails save(Trails trails);

    Optional<Trails> findById(Long id);

    void delete(Trails trails);


    void save(String trail);
}

