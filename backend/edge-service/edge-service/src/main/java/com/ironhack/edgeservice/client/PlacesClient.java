package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.PlaceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient("outdoor-places-service")
public interface PlacesClient {

    @GetMapping("/places")
    List<PlaceDTO> getPlaces();

    @PutMapping("/place/edit/{id}")
    void updatePlace(Long id, PlaceDTO place);

    @DeleteMapping("/place/{id}")
    void deletePlace(Long id);

    @PostMapping("/place/add")
    PlaceDTO createPlace(PlaceDTO place);

    @GetMapping("/places/{id}")
    PlaceDTO getPlace(Long id);

    @GetMapping("/places/name/{name}")
    List<PlaceDTO> getPlaceByName(String name);

    @GetMapping("/places/user/{userId}")
    List<PlaceDTO> getPlaceByUserId(Long userId);

    @GetMapping("/places/category/{category}")
    List<PlaceDTO> getPlaceByCategory(String category);

    @GetMapping("/places/address/{address}")
    List<PlaceDTO> getPlaceByAddress(String address);

    @GetMapping("/places/region/{region}")
    List<PlaceDTO> getPlaceByRegion(String region);

    @GetMapping("/places/latitude/{latitude}/longitude/{longitude}")
    List<PlaceDTO> getPlaceByLatitudeAndLongitude(double latitude, double longitude);
}
