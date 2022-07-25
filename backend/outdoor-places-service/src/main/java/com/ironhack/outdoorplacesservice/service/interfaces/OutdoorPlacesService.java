package com.ironhack.outdoorplacesservice.service.interfaces;

import com.ironhack.outdoorplacesservice.model.OutdoorPlaces;

public interface OutdoorPlacesService {
    OutdoorPlaces findOutdoorPlacesById(Long id);

    void delete(Long id);

    OutdoorPlaces updateOutdoorPlaces(Long id, OutdoorPlaces outdoorPlaces);

    OutdoorPlaces findOutdoorPlacesByName(String name);

    OutdoorPlaces findOutdoorPlacesByUserId(Long userId);

    OutdoorPlaces findOutdoorPlacesByCategory(String category);

    OutdoorPlaces findOutdoorPlacesByAddress(String address);


    OutdoorPlaces findOutdoorPlacesByRegion(String region);

    OutdoorPlaces createOutdoorPlaces(OutdoorPlaces outdoorPlaces);
}
