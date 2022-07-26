package com.ironhack.outdoorplacesservice.service.interfaces;

import com.ironhack.outdoorplacesservice.controller.dto.PlaceDTO;
import com.ironhack.outdoorplacesservice.model.Place;

import java.util.List;

public interface PlaceService {
    Place findPlaceById(Long id);

    void delete(Long id);

    Place updatePlace(Long id, PlaceDTO places);

    List<Place> findPlaceByName(String name);

    List<Place> findPlaceByUserId(Long userId);

    List<Place> findPlaceByCategory(String category);

    List<Place> findPlaceByAddress(String address);


    List<Place> findPlaceByRegion(String region);

    List<Place> findPlaceByLatitudeAndLongitude(double latitude, double longitude);
}


