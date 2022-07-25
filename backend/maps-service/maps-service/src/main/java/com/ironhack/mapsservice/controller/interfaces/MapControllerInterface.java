package com.ironhack.mapsservice.controller.interfaces;

import com.ironhack.mapsservice.model.Response;

public interface MapControllerInterface {

    public Response getLocation(String address);
    public Response getAddress(String latlng);

}
