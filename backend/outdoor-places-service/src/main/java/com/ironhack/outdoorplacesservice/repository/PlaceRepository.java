package com.ironhack.outdoorplacesservice.repository;

import com.ironhack.outdoorplacesservice.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
    List<Place> findAll();

    Place save(Place places);

    Optional<Place> findById(Long id);

    void delete(Place places);

    List<Place> findByName(String name);

    List<Place> findByUserId(Long userId);

    List<Place> findByCategory(String category);

    List<Place> findByAddress(String address);

    List<Place> findByRegion(String region);

    List<Place> findByLatitudeAndLongitude(double latitude, double longitude);
}
