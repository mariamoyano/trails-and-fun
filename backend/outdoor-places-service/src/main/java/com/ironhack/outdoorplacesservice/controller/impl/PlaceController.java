package com.ironhack.outdoorplacesservice.controller.impl;

import com.ironhack.outdoorplacesservice.controller.interfaces.PlaceControllerInterface;
import com.ironhack.outdoorplacesservice.model.Place;
import com.ironhack.outdoorplacesservice.repository.PlaceRepository;
import com.ironhack.outdoorplacesservice.service.interfaces.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PlaceController implements PlaceControllerInterface {
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private PlaceService placeService;

    @GetMapping("/places")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    @PutMapping("/place/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Place updatePlace(@PathVariable("id") Long id, @RequestBody @Valid Place place) {
        Place placeUpdated = placeService.updatePlace(id, place);
        return placeUpdated;
    }

    @DeleteMapping("/place/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlace(Long id) {
        placeService.delete(id);
    }

    @PostMapping("/place/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Place createPlace(@RequestBody Place place) {
        return placeRepository.save(place);
    }

    @GetMapping("/places/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Place findPlaceById(@PathVariable (name = "id") Long id) {
        return  placeService.findPlaceById(id);
    }

    @GetMapping("/places/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findPlaceByName(@PathVariable (name = "name") String name) {
        return placeService.findPlaceByName(name);
    }

    @GetMapping("/places/user/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findPlaceByUserId(@PathVariable (name = "userId") Long userId) {
        return placeService.findPlaceByUserId(userId);
    }


    @GetMapping("/places/category/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findPlaceByCategory(@PathVariable (name = "category") String category) {
        return placeService.findPlaceByCategory(category);
    }

    @GetMapping("/places/address/{address}")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findPlaceByAddress(String address) {
        return placeService.findPlaceByAddress(address);
    }

    @GetMapping("/places/region/{region}")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findPlaceByRegion(String region) {
        return placeService.findPlaceByRegion(region);
    }

    @GetMapping("/places/latitude/{latitude}/longitude/{longitude}")
    @ResponseStatus(HttpStatus.OK)
    public List<Place> findPlaceByLatitudeAndLongitude(@PathVariable (name = "latitude") double latitude, @PathVariable (name = "longitude") double longitude) {
        return placeService.findPlaceByLatitudeAndLongitude(latitude, longitude);
    }



}
