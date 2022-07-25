package com.ironhack.outdoorplacesservice.service.impl;

import com.ironhack.outdoorplacesservice.model.Place;
import com.ironhack.outdoorplacesservice.repository.PlaceRepository;
import com.ironhack.outdoorplacesservice.service.interfaces.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public Place findPlaceById(Long id) {
        Place places = placeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OutdoorPlaces not found"));
        return places;
    }

    public void delete(Long id) {
        Place places = placeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OutdoorPlaces not found"));
        placeRepository.delete(places);

    }


    public Place updatePlace(Long id, Place places) {
        Place placesUpdated = placeRepository.findById(id)
                .map(outdoorPlaces1 -> {
                    outdoorPlaces1.setName(places.getName());
                    outdoorPlaces1.setCategory(places.getCategory());
                    outdoorPlaces1.setAddress(places.getAddress());
                    outdoorPlaces1.setRegion(places.getRegion());
                    return placeRepository.save(outdoorPlaces1);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OutdoorPlaces not found"));
        return placesUpdated;

    }


    public List<Place> findPlaceByName(String name) {
        List<Place> places = placeRepository.findByName(name);
        return places;

    }

    public List<Place> findPlaceByUserId(Long userId) {
        List<Place> places = placeRepository.findByUserId(userId);
        return places;

    }


    public List<Place> findPlaceByCategory(String category) {
        List<Place> places = placeRepository.findByCategory(category);
        return places;

    }

    public List<Place> findPlaceByAddress(String address) {
        List<Place> places = placeRepository.findByAddress(address);
        return places;

    }

    public List<Place> findPlaceByRegion(String region) {
        List <Place> places = placeRepository.findByRegion(region);
        return places;

    }

    @Override
    public List<Place> findPlaceByLatitudeAndLongitude(double latitude, double longitude) {
        List<Place> places = placeRepository.findByLatitudeAndLongitude(latitude, longitude);
        return places;
    }


}

