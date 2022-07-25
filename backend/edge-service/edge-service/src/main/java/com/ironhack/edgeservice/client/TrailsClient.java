package com.ironhack.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("trails-service")
public interface TrailsClient {

    @GetMapping("/trails")
    String getTrails();


}
