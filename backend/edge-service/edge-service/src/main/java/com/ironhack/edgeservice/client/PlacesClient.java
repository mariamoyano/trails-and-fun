package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.PlaceDTO;
import com.ironhack.edgeservice.enums.Category;
import com.ironhack.edgeservice.enums.Region;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("outdoor-places-service")
public interface PlacesClient {

    @GetMapping("/places")
    List<PlaceDTO> getPlaces();

    @PutMapping("/place/edit/{id}")
    void updatePlace(@PathVariable Long id, @RequestBody PlaceDTO place);

    @DeleteMapping("/place/{id}")
    void deletePlace(@PathVariable Long id);

    @PostMapping("/place/add")
    PlaceDTO createPlace(PlaceDTO place);

    @GetMapping("/places/{id}")
    PlaceDTO getPlace(@PathVariable Long id);

    @GetMapping("/places/name/{name}")
    List<PlaceDTO> getPlaceByName(@PathVariable String name);

    @GetMapping("/places/user/{userId}")
    List<PlaceDTO> getPlaceByUserId(@PathVariable Long userId);

    @GetMapping("/places/category/{category}")
    List<PlaceDTO> getPlaceByCategory(@PathVariable Category category);

    @GetMapping("/places/address/{address}")
    List<PlaceDTO> getPlaceByAddress(@PathVariable String address);

    @GetMapping("/places/region/{region}")
    List<PlaceDTO> getPlaceByRegion(@PathVariable Region region);

    @GetMapping("/places/latitude/{latitude}/longitude/{longitude}")
    List<PlaceDTO> getPlaceByLatitudeAndLongitude(@PathVariable double latitude, @PathVariable double longitude);
}
