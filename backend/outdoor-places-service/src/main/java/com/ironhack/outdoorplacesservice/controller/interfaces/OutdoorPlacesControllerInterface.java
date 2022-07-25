package com.ironhack.outdoorplacesservice.controller.interfaces;

import com.ironhack.outdoorplacesservice.enums.Category;
import com.ironhack.outdoorplacesservice.model.OutdoorPlaces;

import java.util.List;

public interface OutdoorPlacesControllerInterface {

    List<OutdoorPlaces> findAll();
    OutdoorPlaces createOutdoorPlaces(OutdoorPlaces outdoorPlaces);
    OutdoorPlaces findOutdoorPlacesById(Long id);
    OutdoorPlaces findOutdoorPlacesByName(String name);
    OutdoorPlaces findOutdoorPlacesByUserId(Long userId);
    OutdoorPlaces findOutdoorPlacesByCategory(String category);
    OutdoorPlaces findOutdoorPlacesByAddress(String address);
    OutdoorPlaces findOutdoorPlacesByRegion(String region);
    OutdoorPlaces updateOutdoorPlaces(Long id,OutdoorPlaces outdoorPlaces);
    void deleteOutdoorPlaces(Long id);


}
