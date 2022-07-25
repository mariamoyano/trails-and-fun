package com.ironhack.outdoorplacesservice.repository;

import com.ironhack.outdoorplacesservice.model.OutdoorPlaces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OutdoorPlacesRepository  extends JpaRepository<OutdoorPlaces, Long> {
    List<OutdoorPlaces> findAll();

    OutdoorPlaces save(OutdoorPlaces outdoorPlaces);

    Optional<OutdoorPlaces> findById(Long id);

    void delete(OutdoorPlaces outdoorPlaces);

    OutdoorPlaces findByName(String name);

    OutdoorPlaces findByUserId(Long userId);

    OutdoorPlaces findByCategory(String category);

    OutdoorPlaces findByAddress(String address);

    OutdoorPlaces findByRegion(String region);
}
