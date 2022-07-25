package com.ironhack.outdoorplacesservice.controller.impl;

import com.ironhack.outdoorplacesservice.controller.interfaces.OutdoorPlacesControllerInterface;
import com.ironhack.outdoorplacesservice.enums.Category;
import com.ironhack.outdoorplacesservice.model.OutdoorPlaces;
import com.ironhack.outdoorplacesservice.repository.OutdoorPlacesRepository;
import com.ironhack.outdoorplacesservice.service.interfaces.OutdoorPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OutdoorPlacesController implements OutdoorPlacesControllerInterface {
    @Autowired
    private OutdoorPlacesRepository outdoorPlacesRepository;
    @Autowired
    private OutdoorPlacesService outdoorPlacesService;

    @GetMapping("/places")
    @ResponseStatus(HttpStatus.OK)
    public List<OutdoorPlaces> findAll() {
        return outdoorPlacesRepository.findAll();
    }

    @PutMapping("/places/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public OutdoorPlaces updateOutdoorPlaces(@PathVariable("id") Long id, @RequestBody @Valid OutdoorPlaces outdoorPlaces) {
        OutdoorPlaces outdoorPlacesUpdated = outdoorPlacesService.updateOutdoorPlaces(id, outdoorPlaces);
        return outdoorPlacesUpdated;
    }

    @DeleteMapping("/places/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOutdoorPlaces(Long id) {
        outdoorPlacesService.delete(id);
    }

    @PostMapping("/places")
    @ResponseStatus(HttpStatus.CREATED)
    public OutdoorPlaces createOutdoorPlaces(@RequestBody OutdoorPlaces outdoorPlaces) {
        OutdoorPlaces outdoorPlacesCreated = outdoorPlacesService.createOutdoorPlaces(outdoorPlaces);
        return outdoorPlacesCreated;
    }

    @GetMapping("/places/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OutdoorPlaces findOutdoorPlacesById(@PathVariable (name = "id") Long id) {
        return  outdoorPlacesService.findOutdoorPlacesById(id);
    }

    @GetMapping("/places/{name}")
    @ResponseStatus(HttpStatus.OK)
    public OutdoorPlaces findOutdoorPlacesByName(@PathVariable (name = "name") String name) {
        return outdoorPlacesService.findOutdoorPlacesByName(name);
    }

    @GetMapping("/places/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public OutdoorPlaces findOutdoorPlacesByUserId(@PathVariable (name = "userId") Long userId) {
        return outdoorPlacesService.findOutdoorPlacesByUserId(userId);
    }


    @GetMapping("/places/{category}")
    @ResponseStatus(HttpStatus.OK)
    public OutdoorPlaces findOutdoorPlacesByCategory(@PathVariable (name = "category") String category) {
        return outdoorPlacesService.findOutdoorPlacesByCategory(category);
    }

    @GetMapping("/places/{address}")
    @ResponseStatus(HttpStatus.OK)
    public OutdoorPlaces findOutdoorPlacesByAddress(String address) {
        return outdoorPlacesService.findOutdoorPlacesByAddress(address);
    }

    @GetMapping("/places/{city}")
    @ResponseStatus(HttpStatus.OK)
    public OutdoorPlaces findOutdoorPlacesByRegion(String region) {
        return outdoorPlacesService.findOutdoorPlacesByRegion(region);
    }





}
