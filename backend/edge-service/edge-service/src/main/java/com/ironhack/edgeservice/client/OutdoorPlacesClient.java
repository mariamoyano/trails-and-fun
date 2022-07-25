package com.ironhack.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("outdoor-places-service")
public interface OutdoorPlacesClient {

    @GetMapping("/places")
    String getPlaces();

}
