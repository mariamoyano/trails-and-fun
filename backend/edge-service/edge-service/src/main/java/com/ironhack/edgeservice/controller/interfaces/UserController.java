package com.ironhack.edgeservice.controller.interfaces;

import com.ironhack.edgeservice.controller.dto.PlaceDTO;
import com.ironhack.edgeservice.controller.dto.TrailDTO;
import com.ironhack.edgeservice.controller.dto.UserDTO;
import com.ironhack.edgeservice.enums.Category;
import com.ironhack.edgeservice.enums.Region;
import com.ironhack.edgeservice.model.User;


import java.util.List;

public interface UserController {
    UserDTO register(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO login(User user);




    ///////////////CLIENTS//////////////////////

    List<PlaceDTO> getPlaces();

    void updatePlace(Long id, PlaceDTO place);

    void deletePlace(Long id);

    PlaceDTO createPlace(PlaceDTO place);

    PlaceDTO getPlace(Long id);

    List<PlaceDTO> getPlaceByName(String name);

    List<PlaceDTO> getPlaceByUserId(Long userId);

    List<PlaceDTO> getPlaceByCategory(Category category);

    List<PlaceDTO> getPlaceByAddress(String address);

    List<PlaceDTO> getPlaceByRegion(Region region);

    List<PlaceDTO> getPlaceByLatitudeAndLongitude(double latitude, double longitude);


    List<TrailDTO> getTrails();

    TrailDTO getTrail(Long id);

    void updateTrail(Long id, TrailDTO trail);

    void deleteTrail(Long id);

    TrailDTO createTrail(TrailDTO trail);

}
