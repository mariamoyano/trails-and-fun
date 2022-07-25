package com.ironhack.mapsservice.controller.impl;

import com.ironhack.mapsservice.controller.interfaces.MapControllerInterface;
import com.ironhack.mapsservice.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class MapsControllerImpl implements MapControllerInterface {

    private static final String API_KEY = "AIzaSyDuXDlRhlxSgWzlPoVWjFXgwF0uIcUQxNo";


    //Get longitude and latitude from address
    @GetMapping("/getlocation")
    public Response getLocation(@RequestParam String address) {
        UriComponents uriComponent = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("maps.googleapis.com")
                .path("maps/api/geocode/json")
                .queryParam("key",API_KEY)
                .queryParam("address",address)
                .build();
        System.out.println(uriComponent.toUriString());
        ResponseEntity<Response> response= new RestTemplate().getForEntity(uriComponent.toUriString(),Response.class);
        return response.getBody();
    }
    //Get address from longitude and latitude
    @GetMapping("/getaddress")
    public Response getAddress(@RequestParam String latlng) {
        UriComponents uriComponent = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("maps.googleapis.com")
                .path("maps/api/geocode/json")
                .queryParam("key",API_KEY)
                .queryParam("latlng",latlng)
                .build();
        System.out.println(uriComponent.toUriString());
        ResponseEntity<Response> response= new RestTemplate().getForEntity(uriComponent.toUriString(),Response.class);
        return response.getBody();
    }



}
