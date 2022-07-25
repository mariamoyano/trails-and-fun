package com.ironhack.outdoorplacesservice.service.impl;

import com.ironhack.outdoorplacesservice.model.OutdoorPlaces;
import com.ironhack.outdoorplacesservice.repository.OutdoorPlacesRepository;
import com.ironhack.outdoorplacesservice.service.interfaces.OutdoorPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class OutdoorPlacesServiceImpl implements OutdoorPlacesService {

    @Autowired
    private OutdoorPlacesRepository outdoorPlacesRepository;

    public OutdoorPlaces findOutdoorPlacesById(Long id) {
        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OutdoorPlaces not found"));
        return outdoorPlaces;
    }

    public void delete(Long id) {
        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OutdoorPlaces not found"));
        outdoorPlacesRepository.delete(outdoorPlaces);

    }


    public OutdoorPlaces updateOutdoorPlaces( Long id, OutdoorPlaces outdoorPlaces) {
        OutdoorPlaces outdoorPlacesUpdated = outdoorPlacesRepository.findById(id)
                .map(outdoorPlaces1 -> {
                    outdoorPlaces1.setName(outdoorPlaces.getName());
                    outdoorPlaces1.setCategory(outdoorPlaces.getCategory());
                    outdoorPlaces1.setAddress(outdoorPlaces.getAddress());
                    outdoorPlaces1.setRegion(outdoorPlaces.getRegion());
                    return outdoorPlacesRepository.save(outdoorPlaces1);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OutdoorPlaces not found"));
        return outdoorPlacesUpdated;

    }


    public OutdoorPlaces findOutdoorPlacesByName(String name) {
        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findByName(name);
        return outdoorPlaces;

    }

    public OutdoorPlaces findOutdoorPlacesByUserId(Long userId) {
        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findByUserId(userId);
        return outdoorPlaces;

    }


    public OutdoorPlaces findOutdoorPlacesByCategory(String category) {
        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findByCategory(category);
        return outdoorPlaces;

    }

    public OutdoorPlaces findOutdoorPlacesByAddress(String address) {
        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findByAddress(address);
        return outdoorPlaces;

    }

    public OutdoorPlaces findOutdoorPlacesByRegion(String region) {

        OutdoorPlaces outdoorPlaces = outdoorPlacesRepository.findByRegion(region);
        return outdoorPlaces;

    }

    @Override
    public OutdoorPlaces createOutdoorPlaces(OutdoorPlaces outdoorPlaces) {
        OutdoorPlaces outdoorPlacesCreated = outdoorPlacesRepository.save(outdoorPlaces);
        return outdoorPlacesCreated;
    }
}

