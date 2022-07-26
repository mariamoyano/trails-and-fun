package com.ironhack.outdoorplacesservice.controller.interfaces;

import com.ironhack.outdoorplacesservice.controller.dto.PlaceDTO;
import com.ironhack.outdoorplacesservice.model.Place;

import java.util.List;

public interface PlaceControllerInterface {

    List<Place> findAll();
    Place createPlace(Place place);
    Place findPlaceById(Long id);
    List<Place> findPlaceByName(String name);
    List<Place> findPlaceByUserId(Long userId);
    List<Place> findPlaceByCategory(String category);
    List<Place> findPlaceByAddress(String address);
    List<Place> findPlaceByRegion(String region);
    Place updatePlace(Long id, PlaceDTO place);
    void deletePlace(Long id);

    List<Place> findPlaceByLatitudeAndLongitude(double latitude, double longitude);


}
